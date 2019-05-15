:smile:smile-dialog:smile:
============
使用DialogFragment封装了简单的提示框，用Vector实现简单的动画效果，让提示框更有活力
</br><img src="img/show.gif" width="150"/>
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
说明：
- 所有设置文字的方法，参数都有两种，分别是（@NonNull CharSequence text）和（@StringRes int res）;
+ 所有设置颜色的方法，参数有三种，分别是(@ColorInt int color)、(ColorStateList color) 和(@ColorRes int color) ，前两者是setXXXColor()，后者为setResColor();
- 设置按钮文字时，如果只有一个参数，则为按钮文字，如有第二个参数，则表示给按钮添加点击事件
+ 所有方法都是有参数的，参数请参考实际代码

| 方法                                                                          | 说明                                  |
|-------------------------------------------------------------------------------|-------------------------------------|
| setTitleText()                                                                | 设置标题文字                          |
| setTitleTextColor()   /   setTitleTextResColor()                              | 设置标题字体颜色                       |
| setContentText()                                                              | 设置内容文字                          |
| setContentTextColor()  / setContentTextResColor()                             | 设置内容字体颜色                       |
| setConformButton()                                                            | 设置确认按钮文字                       |
| setOnConformClickListener(listener)                                           | 设置确认监听事件                       |
| setCancelButton()                                                             | 设置取消按钮文字（默认隐藏，有文字，则显示）|
| setOnCancelClickListener(listener)                                            | 设置取消监听事件                       |
| setConformTextColor()  / setConformTextResColor()                             | 设置确认按钮文字颜色                    |
| setCancelTextColor()     / setCancelTextResColor()                            | 设置取消按钮文字颜色                    |
| setConformBgColor()   / setConformBgResColor()                                | 设置确认按钮背景颜色                    |
| setCancelBgColor()    / setCancelBgResColor()                                 | 设置取消按钮背景颜色                    |
| hideTitle()                                                                   | 隐藏标题                              |
| hideIcon()                                                                    | 隐藏Icon                             |
| setCancelable()                                                               | 是否可以取消                           |
| setCanceledOnTouchOutside()                                                   | 点击区域外是否消失                      |
| setWindowAnimations()                                                         | 设置动画style                         |

## License

	MIT License

	Copyright (c) 2019 rosefinches

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.
