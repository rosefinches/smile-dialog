package com.rosefinches.smiledialog.enums;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * Author: wangbl
 * Date: 2019-07-15 10:57
 * Email:js_wangbl@hotmail.com
 * Description:控件类型
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef({WidgetTypes.TITLE, WidgetTypes.CONTENT, WidgetTypes.CONFORM, WidgetTypes.CANCEL})
public @interface WidgetTypes {

    public static final int TITLE = 0;
    public static final int CONTENT = 1;
    public static final int CONFORM = 2;
    public static final int CANCEL = 3;
}
