package com.rosefinches.smiledialog;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;

import com.rosefinches.smiledialog.enums.SmileDialogType;
import com.rosefinches.smiledialog.enums.WidgetTypes;
import com.rosefinches.smiledialog.interfac.OnCancelClickListener;
import com.rosefinches.smiledialog.interfac.OnConformClickListener;


public class SmileDialogFragment extends DialogFragment {


    private OnFragmentCreatedListener mListener;
    private OnCancelClickListener mCancelClickListener;
    private OnConformClickListener mConformClickListener;


    ImageView mIcon;
    TextView mTitle, mContent, mOk, mCancel;


    public SmileDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setStyle(STYLE_NO_TITLE, R.style.SmileDialogStyle);

    }

    @RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getDialog().getWindow().setWindowAnimations(R.style.dialog_anim_style);


        View view = inflater.inflate(R.layout.fragment_smile_dialog, container, false);
        mIcon = view.findViewById(R.id.iv_icon);
        mTitle = view.findViewById(R.id.tv_title);
        mContent = view.findViewById(R.id.tv_content);
        mOk = view.findViewById(R.id.btn_ok);
        mCancel = view.findViewById(R.id.btn_cancel);
        mOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mConformClickListener != null) {
                    mConformClickListener.onConformClicked();
                }
                dismiss();

            }
        });

        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCancelClickListener != null) {
                    mCancelClickListener.onCancelClickListener();
                }
                dismiss();

            }
        });

        return view;
    }

    /**
     * 设置对话框类型
     *
     * @param type 类型
     */
    void setDialogType(@SmileDialogType int type) {
        if (type == SmileDialogType.WARNING) {
            mIcon.setImageResource(R.drawable.anim_warning);
        }

        if (type == SmileDialogType.SUCCESS) {
            mIcon.setImageResource(R.drawable.anim_success);
        }

        if (type == SmileDialogType.ERROR) {
            mIcon.setImageResource(R.drawable.anim_error);
        }

        Drawable drawable = mIcon.getDrawable();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.DONUT) {
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            }
        }
    }

    /**
     * 添加监听事件
     *
     * @param listener
     */
    void addOnFragmentCreatedListener(OnFragmentCreatedListener listener) {
        mListener = listener;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        if (mListener != null) {
            mListener.onFragmentCreated();
        }


        super.onViewCreated(view, savedInstanceState);
    }

    /**
     * 添加确认按钮点击事件
     *
     * @param listener 事件
     */
    void addOnConformClickListener(OnConformClickListener listener) {
        mConformClickListener = listener;
    }

    /**
     * 添加取消按钮点击事件
     *
     * @param listener 事件
     */
    void addOnCancelClickListener(OnCancelClickListener listener) {
        mCancelClickListener = listener;
    }

    /**
     * 根据枚举，找到对应的TextView
     *
     * @param widgets 控件枚举
     * @return 控件
     */
    private TextView getTextViewByWidgetType(@WidgetTypes int widgets) {

        if (widgets == WidgetTypes.TITLE) {
            return mTitle;
        }
        if (widgets == WidgetTypes.CONTENT) {
            return mContent;
        }
        if (widgets == WidgetTypes.CONFORM) {

            return mOk;
        }
        if (widgets == WidgetTypes.CANCEL) {
            return mCancel;
        }
        return null;
    }

    /**
     * 设置文字
     *
     * @param widgets 控件枚举
     * @param text    文字
     */
    void setText(@WidgetTypes int widgets, CharSequence text) {
        TextView mText = getTextViewByWidgetType(widgets);
        if (mText != null) {
            mText.setText(text);
        }
    }

    /**
     * 隐藏取消按钮，true 隐藏、false 显示
     *
     * @param isHided 是否隐藏
     */
    public void hideCancelButton(boolean isHided) {
        if (isHided) {
            mCancel.setVisibility(View.GONE);
        } else {
            mCancel.setVisibility(View.VISIBLE);
        }
    }

    /**
     * 隐藏title
     *
     * @param isHided 是否隐藏
     */
    void hideTitle(boolean isHided) {
        if (isHided)
            mTitle.setVisibility(View.GONE);
        else mTitle.setVisibility(View.VISIBLE);
    }


    /**
     * 设置字体颜色
     *
     * @param widgets 控件
     * @param color   颜色
     */
    void setTextColor(@WidgetTypes int widgets, ColorStateList color) {
        TextView mText = getTextViewByWidgetType(widgets);
        if (mText != null)
            mText.setTextColor(color);

    }


    /**
     * 设置控件的背景颜色
     *
     * @param widgets 控件
     * @param color   颜色
     */
    void setButtonBgColor(@WidgetTypes int widgets, ColorStateList color) {
        TextView button = getTextViewByWidgetType(widgets);
        if (button != null)
            setButtonColor(button, color);

    }

    /**
     * 隐藏Icon
     *
     * @param isHide 是否隐藏
     */
    void hideIcon(boolean isHide) {
        if (isHide) {
            mIcon.setVisibility(View.GONE);
        } else mIcon.setVisibility(View.VISIBLE);
    }


    /**
     * 设置按钮背景颜色
     *
     * @param button         按钮
     * @param colorStateList 颜色
     */
    private void setButtonColor(TextView button, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            button.setBackgroundTintList(colorStateList);
            button.setBackgroundTintMode(PorterDuff.Mode.SRC);
        } else {
            ViewCompat.setBackgroundTintList(button, colorStateList);
            ViewCompat.setBackgroundTintMode(button, PorterDuff.Mode.SRC);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    /**
     * 监听Fragment 已创建 onViewCreated中调用
     */
    interface OnFragmentCreatedListener {
        void onFragmentCreated();
    }
}
