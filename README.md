:smile:smile-dialog:smile:
============
使用DialogFragment封装了简单的提示框，用Vector实现简单的动画效果，让提示框更有活力
============
### 基本使用
#### 1.添加Gradle依赖
> Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
  }
```
> Step 2. Add the dependency
```
	dependencies {
	        implementation 'com.github.rosefinches:smile-dialog:1.0.1'
	}

```

#### 2.主要代码实现
```
      SmileDialog dialog = new SmileDialogBuilder(MainActivity.this, SmileDialogType.ERROR)
                        .setTitleText(R.string.app_name)
                        .setTitleText("222")
                        .setContentText(null)
                        .setConformBgResColor(R.color.colorPrimary)
                        .setTitleTextResColor(R.color.colorAccent)
                        .setContentTextColor(Color.RED)
                        .setConformTextColor(Color.GREEN)
                        .setCancelTextColor(Color.GREEN)
//                        .setCanceledOnTouchOutside(false)
//                        .setCancelable(false)
//                .hideTitle(true)
                        .setConformButton("sss")
                        .setWindowAnimations(R.style.dialog_style)
                        .build();

                dialog.show();
```
### 更多API，请查看一下表格

| 方法                                                                          | 说明                                  |
|-------------------------------------------------------------------------------|-------------------------------------|
| setTitleText(@NonNull CharSequence text)                                      | 设置标题文字（字符串）                  |
| setTitleText(@StringRes int res)                                              | 设置标题文字（strings.xml）            |
| setTitleTextColor(@ColorInt int color)                                        | 设置标题字体颜色（Color.java类的颜色）   |
| setTitleTextColor(ColorStateList color)                                       | 设置标题字体颜色（ColorStateList）      |
| setTitleTextResColor(@ColorRes int color)                                     | 设置标题字体颜色（colors.xml）          |
| setContentText(@NonNull CharSequence text)                                    | 设置内容文字（字符串）                  |
| setContentText(@StringRes int res)                                            | 设置内容文字（strings.xml）            |
| setContentTextColor(@ColorInt int color)                                      | 设置内容字体颜色（Color.java类的颜色）   |
| setContentTextColor(ColorStateList color)                                     | 设置内容字体颜色（ColorStateList）      |
| setContentTextResColor(@ColorRes int color)                                   | 设置内容字体颜色（colors.xml）          |
| setConformButton(@StringRes int res)                                          | 设置确认按钮文字（strings.xml）         |
| setConformButton(@NonNull CharSequence text)                                  | 设置确认按钮文字（字符串）               |
| setOnConformClickListener(OnConformClickListener listener)                    | 设置确认监听事件                        |
| setConformButton(@StringRes int res, OnConformClickListener listener)         | 设置确认按钮文字+监听事件（strings.xml）  |
| setConformButton(@NonNull CharSequence text, OnConformClickListener listener) | 设置确认按钮文字+监听事件（字符串）        |
| setCancelButton(@NonNull CharSequence text)                                   | 设置取消按钮文字（字符串）               |
| setCancelButton(@StringRes int res)                                           | 设置取消按钮文字（strings.xml）         |
| setOnCancelClickListener(OnCancelClickListener listener)                      | 设置取消监听事件                        |
| setCancelButton(@NonNull CharSequence text, OnCancelClickListener listener)   | 设置取消按钮文字+监听事件（字符串）        |
| setCancelButton(@StringRes int res, OnCancelClickListener listener)           | 设置取消按钮文字+监听事件（strings.xml）  |
| setConformTextColor(@ColorInt int color)                                      | 设置确认按钮文字颜色                     |
| setConformTextColor(ColorStateList color)                                     | 设置确认按钮文字颜色                     |
| setConformTextResColor(@ColorRes int color)                                   | 设置确认按钮文字颜色                     |
| setCancelTextColor(@ColorInt int color)                                       | 设置取消按钮文字颜色                     |
| setCancelTextColor(ColorStateList color)                                      | 设置取消按钮文字颜色                     |
| setCancelTextResColor(@ColorRes int color)                                    | 设置取消按钮文字颜色                     |
| setConformBgColor(@ColorInt int color)                                        | 设置确认按钮背景颜色                     |
| setConformBgColor(ColorStateList color)                                       | 设置确认按钮背景颜色                     |
| setConformBgResColor(@ColorRes int color)                                     | 设置确认按钮背景颜色                     |
| setCancelBgColor(ColorStateList color)                                        | 设置取消按钮背景颜色                     |
| setCancelBgResColor(@ColorRes int color)                                      | 设置取消按钮背景颜色                     |
| setCancelBgColor(@ColorInt int color)                                         | 设置取消按钮背景颜色                     |
| hideTitle(boolean isHided)                                                    | 隐藏标题                               |
| hideIcon(boolean isHide)                                                      | 隐藏Icon                              |
| setCancelable(boolean cancelable)                                             | 是否可以取消                            |
| setCanceledOnTouchOutside(boolean cancelableOnTouchOutside)                   | 点击区域外是否消失                       |
| setWindowAnimations(@StyleRes int style)                                      | 设置动画style                          |
