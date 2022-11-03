/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkombizz.common.enums;

/**
 *
 * @author ahmad
 */
public class EnumDataType {

    public enum ENUM_DataType {
        STRING,
        NUMERIC,
        DOUBLE,
        CURRENCY,
        DATETIME,
        BOOLEAN,
        TEXT,
    }

    public static String toString(EnumDataType.ENUM_DataType dt) {
        String val = "";

        if (dt == EnumDataType.ENUM_DataType.STRING) {
            val = "varchar";
        } else if (dt == EnumDataType.ENUM_DataType.NUMERIC) {
            val = "int";
        } else if (dt == EnumDataType.ENUM_DataType.CURRENCY) {
            val = "decimal(18,4)";
        } else if (dt == EnumDataType.ENUM_DataType.DOUBLE) {
            val = "decimal(18,2)";
        } else if (dt == EnumDataType.ENUM_DataType.DATETIME) {
            val = "datetime";
        } else if (dt == EnumDataType.ENUM_DataType.BOOLEAN) {
            val = "tinyint";
        } else {
            val = "text";
        }

        return val;
    }
}
