package com.rosefinches.smiledialog;

import android.content.res.ColorStateList;

import com.rosefinches.smiledialog.enums.DialogType;
import com.rosefinches.smiledialog.interfac.OnCancelClickListener;
import com.rosefinches.smiledialog.interfac.OnConformClickListener;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

/**
 * Author: wangbl
 * Date: 2019/5/8 3:17 PM
 * Email:js_wangbl@hotmail.com
 * Description: builder类
 */
public class DialogBuilder {

    private DialogOptions mOptions;

    /**
     * 构造方法（默认对话框类型是DialogType.WARNING）
     *
     * @param activity activity
     */
    public DialogBuilder(AppCompatActivity activity) {
        this(activity, DialogType.WARNING);
    }


    /**
     * 构造方法
     *
     * @param activity activity
     * @param type     对话框类型
     */
    public DialogBuilder(AppCompatActivity activity, DialogType type) {
        mOptions = new DialogOptions();
        mOptions.activity = activity;
        mOptions.type = type;
    }

    /**
     * 设置title文字
     *
     * @param text 文字
     * @return this
     */
    public DialogBuilder setTitleText(@NonNull CharSequence text) {
        mOptions.titleText = text;
        return this;
    }

    /**
     * 设置title文字
     *
     * @param res 文字资源
     * @return this
     */
    public DialogBuilder setTitleText(@StringRes int res) {
        mOptions.titleText = mOptions.activity.getText(res);
        return this;
    }


    /**
     * 设置内容文字
     *
     * @param text 文字
     * @return this
     */
    public DialogBuilder setContentText(@NonNull CharSequence text) {
        mOptions.contentText = text;
        return this;
    }

    /**
     * 设置内容文字
     *
     * @param res 文字资源
     * @return this
     */
    public DialogBuilder setContentText(@StringRes int res) {
        mOptions.contentText = mOptions.activity.getText(res);
        return this;
    }


    /**
     * 设置确认监听
     *
     * @param listener 监听事件
     * @return this
     */
    public DialogBuilder setOnConformClickListener(OnConformClickListener listener) {
        mOptions.conformClickListener = listener;
        return this;
    }

    /**
     * 设置取消监听
     *
     * @param listener 监听
     * @return this
     */
    public DialogBuilder setOnCancelClickListener(OnCancelClickListener listener) {
        mOptions.cancelClickListener = listener;
        return this;
    }

    /**
     * 设置确定按钮文字
     *
     * @param text     文字
     * @param listener 监听
     * @return this
     */
    public DialogBuilder setConformButton(@NonNull CharSequence text, OnConformClickListener listener) {
        mOptions.conformText = text;
        mOptions.conformClickListener = listener;
        return this;
    }

    /**
     * 设置确定按钮文字
     *
     * @param text 文字
     * @return this
     */
    public DialogBuilder setConformButton(@NonNull CharSequence text) {
        mOptions.conformText = text;
        return this;
    }

    /**
     * 设置确定按钮文字
     *
     * @param res 文字资源
     * @return this
     */
    public DialogBuilder setConformButton(@StringRes int res) {
        mOptions.conformText = mOptions.activity.getText(res);
        return this;
    }


    /**
     * 设置确定按钮文字
     *
     * @param res      文字资源
     * @param listener 监听
     * @return this
     */
    public DialogBuilder setConformButton(@StringRes int res, OnConformClickListener listener) {
        mOptions.conformText = mOptions.activity.getText(res);
        mOptions.conformClickListener = listener;
        return this;
    }


    /**
     * 设置取消按钮文字
     *
     * @param text 文字
     * @return this
     */
    public DialogBuilder setCancelButton(@NonNull CharSequence text) {
        mOptions.cancelText = text;
        return this;
    }

    /**
     * 设置取消按钮文字
     *
     * @param res 文字Resource
     * @return 当前builder
     */
    public DialogBuilder setCancelButton(@StringRes int res) {
        mOptions.cancelText = mOptions.activity.getText(res);
        return this;
    }

    /**
     * 设置取消按钮文字
     *
     * @param listener 监听
     * @param text     文字
     * @return this
     */
    public DialogBuilder setCancelButton(@NonNull CharSequence text, OnCancelClickListener listener) {
        mOptions.cancelText = text;
        mOptions.cancelClickListener = listener;
        return this;
    }

    /**
     * 设置取消按钮文字
     *
     * @param res      文字Resource
     * @param listener 监听
     * @return 当前builder
     */
    public DialogBuilder setCancelButton(@StringRes int res, OnCancelClickListener listener) {
        mOptions.cancelText = mOptions.activity.getText(res);
        mOptions.cancelClickListener = listener;
        return this;
    }

    /**
     * 确定按钮背景颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setConformBgColor(@ColorInt int color) {
        mOptions.conformBgColor = ColorStateList.valueOf(color);
        return this;
    }

    /**
     * 确定按钮背景颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setConformBgColor(ColorStateList color) {
        mOptions.conformBgColor = color;
        return this;
    }

    public DialogBuilder setConformBgResColor(@ColorRes int color) {
        mOptions.conformBgColor = ColorStateList.valueOf(ContextCompat.getColor(mOptions.activity, color));
        return this;
    }


    /**
     * 确定按钮背景颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setCancelBgColor(ColorStateList color) {
        mOptions.cancelBgColor = color;
        return this;
    }

    /**
     * 确定按钮背景颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setCancelBgResColor(@ColorRes int color) {
        mOptions.cancelBgColor = ColorStateList.valueOf(ContextCompat.getColor(mOptions.activity, color));
        return this;
    }

    /**
     * 确定按钮背景颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setCancelBgColor(@ColorInt int color) {
        mOptions.cancelBgColor = ColorStateList.valueOf(color);
        return this;
    }

    /**
     * 设置标题颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setTitleTextColor(@ColorInt int color) {
        mOptions.titleTextColor = ColorStateList.valueOf(color);
        return this;
    }

    /**
     * 设置标题颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setTitleTextColor(ColorStateList color) {
        mOptions.titleTextColor = color;
        return this;
    }

    /**
     * 设置标题颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setTitleTextResColor(@ColorRes int color) {
        mOptions.titleTextColor = ColorStateList.valueOf(ContextCompat.getColor(mOptions.activity, color));
        return this;
    }

    /**
     * 设置内容颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setContentTextColor(@ColorInt int color) {
        mOptions.contentTextColor = ColorStateList.valueOf(color);
        return this;
    }

    /**
     * 设置内容颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setContentTextColor(ColorStateList color) {
        mOptions.contentTextColor = color;
        return this;
    }

    /**
     * 设置内容颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setContentTextResColor(@ColorRes int color) {
        mOptions.contentTextColor = ColorStateList.valueOf(ContextCompat.getColor(mOptions.activity, color));
        return this;
    }

    /**
     * 设置确认按钮颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setConformTextColor(@ColorInt int color) {
        mOptions.conformTextColor = ColorStateList.valueOf(color);
        return this;
    }

    /**
     * 设置确认按钮颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setConformTextColor(ColorStateList color) {
        mOptions.conformTextColor = color;
        return this;
    }

    /**
     * 设置确认按钮颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setConformTextResColor(@ColorRes int color) {
        mOptions.conformTextColor = ColorStateList.valueOf(ContextCompat.getColor(mOptions.activity, color));
        return this;
    }

    /**
     * 设置取消按钮颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setCancelTextColor(@ColorInt int color) {
        mOptions.cancelTextColor = ColorStateList.valueOf(color);
        return this;
    }

    /**
     * 设置取消按钮颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setCancelTextColor(ColorStateList color) {
        mOptions.cancelTextColor = color;
        return this;
    }

    /**
     * 设置取消按钮颜色
     *
     * @param color 颜色
     * @return 当前builder
     */
    public DialogBuilder setCancelTextResColor(@ColorRes int color) {
        mOptions.cancelTextColor = ColorStateList.valueOf(ContextCompat.getColor(mOptions.activity, color));
        return this;
    }

    /**
     * 隐藏标题，默认false
     *
     * @param isHided 是否隐藏
     * @return this
     */
    public DialogBuilder hideTitle(boolean isHided) {
        mOptions.isTitleHided = isHided;
        return this;
    }


    /**
     * dialog弹出后会点击屏幕或物理返回键，dialog不消失
     *
     * @param cancelable 是否可取消
     * @return this
     */
    public DialogBuilder setCancelable(boolean cancelable) {
        mOptions.cancelable = cancelable;
        return this;
    }

    /**
     * 点击区域外是否取消
     *
     * @param cancelableOnTouchOutside
     * @return
     */
    public DialogBuilder setCanceledOnTouchOutside(boolean cancelableOnTouchOutside) {
        mOptions.cancelableOnTouchOutside = cancelableOnTouchOutside;
        return this;
    }

    /**
     * 设置窗体动画
     *
     * @param style
     * @return
     */
    public DialogBuilder setWindowAnimations(@StyleRes int style) {
        mOptions.windowAnimation = style;
        return this;
    }

    public SmileDialog build() {
        return new SmileDialog(mOptions);
    }

}
