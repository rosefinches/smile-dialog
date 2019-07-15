package com.rosefinches.smiledialog.enums;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.rosefinches.smiledialog.enums.SmileDialogType.ERROR;
import static com.rosefinches.smiledialog.enums.SmileDialogType.SUCCESS;
import static com.rosefinches.smiledialog.enums.SmileDialogType.WARNING;

@Retention(RetentionPolicy.SOURCE)
@IntDef({WARNING, SUCCESS, ERROR})
public @interface SmileDialogType {


    int WARNING = 0;
    int SUCCESS = 1;
    int ERROR = 2;
}
