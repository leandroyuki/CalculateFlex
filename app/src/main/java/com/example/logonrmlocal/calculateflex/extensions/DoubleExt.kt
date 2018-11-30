package com.example.logonrmlocal.calculateflex.extensions

fun Double.format(digits: Int) =
        java.lang.String.format("%.${digits}f", this)
