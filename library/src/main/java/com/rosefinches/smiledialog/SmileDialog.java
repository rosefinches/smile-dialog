package com.rosefinches.smiledialog;

import android.os.Build;

import com.rosefinches.smiledialog.interfac.SmileDialogImpl;

import androidx.annotation.RequiresApi;

public class SmileDialog implements SmileDialogImpl, SmileDialogFragment.OnFragmentCreatedListener {


    private DialogOptions mOptions;
    private SmileDialogFragment mDialogFragment;

    SmileDialog(DialogOptions mOptions) {
        this.mOptions = mOptions;
        initView();
    }

    private void initView() {
        mDialogFragment = new SmileDialogFragment();
        mDialogFragment.addOnFragmentCreatedListener(this);

    }

    @Override
    public void show() {
        if (mDialogFragment != null) {
            mDialogFragment.show(mOptions.activity.getSupportFragmentManager(), "");
        }
    }

    @Override
    public void dismiss() {
        if (mDialogFragment != null) {
            mDialogFragment.dismiss();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
    @Override
    public void onFragmentCreated() {
        //设置对话框类型
        mDialogFragment.setDialogType(mOptions.type);
        //TITLE，设置文字
        if (mOptions.titleText != null) {
            mDialogFragment.setText(DialogOptions.Widgets.TITLE, mOptions.titleText);
        }
        //CONTENT，设置文字，
        if (mOptions.contentText != null) {
            mDialogFragment.setText(DialogOptions.Widgets.CONTENT, mOptions.contentText);
        }
        //确认按钮，设置文字
        if (mOptions.conformText != null) {
            mDialogFragment.setText(DialogOptions.Widgets.CONFORM, mOptions.conformText);
        }
        //取消按钮，设置文字,null时隐藏
        if (mOptions.cancelText != null) {
            mDialogFragment.setText(DialogOptions.Widgets.CANCEL, mOptions.cancelText);
        } else {
            mDialogFragment.hideCancelButton(true);
        }
        //设置确认按钮背景颜色
        if (mOptions.conformBgColor != null) {
            mDialogFragment.setButtonBgColor(DialogOptions.Widgets.CONFORM, mOptions.conformBgColor);
        }
        //设置取消按钮背景颜色
        if (mOptions.cancelBgColor != null)
            mDialogFragment.setButtonBgColor(DialogOptions.Widgets.CANCEL, mOptions.cancelBgColor);

        //设置标题字体颜色
        if (mOptions.titleTextColor != null) {
            mDialogFragment.setTextColor(DialogOptions.Widgets.TITLE, mOptions.titleTextColor);
        }
        //设置内容字体颜色
        if (mOptions.contentTextColor != null) {
            mDialogFragment.setTextColor(DialogOptions.Widgets.CONTENT, mOptions.contentTextColor);
        }
        //设置确认按钮字体颜色
        if (mOptions.conformTextColor != null) {
            mDialogFragment.setTextColor(DialogOptions.Widgets.CONFORM, mOptions.conformTextColor);
        }
        //设置取消按钮字体颜色
        if (mOptions.cancelTextColor != null) {
            mDialogFragment.setTextColor(DialogOptions.Widgets.CANCEL, mOptions.cancelTextColor);
        }
        //标题隐藏
        mDialogFragment.hideTitle(mOptions.isTitleHided);
        //设置确认按按钮点击事件
        mDialogFragment.addOnConformClickListener(mOptions.conformClickListener);
        //设置取消按钮点击事件
        mDialogFragment.addOnCancelClickListener(mOptions.cancelClickListener);
        //按返回键，是否可取消
        mDialogFragment.setCancelable(mOptions.cancelable);
        //区域外可取消
        mDialogFragment.getDialog().setCanceledOnTouchOutside(mOptions.cancelableOnTouchOutside);
        //设置窗体动画
        if (mOptions.windowAnimation != null) {
            mDialogFragment.getDialog().getWindow().setWindowAnimations(mOptions.windowAnimation);
        }

    }
}
