package com.kotlin.demo.beans

/**
 * <pre>
 *     author: jian
 *     Date  : 2020/6/18 8:30 PM
 *     Description:
 * </pre>
 */
// 通配符 Java ?      KT  *
data class LoginResponse(
    val admin: Boolean,
    val chapterTops: List<*>,
    val collectIds: List<*>,
    val email: String?,
    val sdsd: String

) {
}