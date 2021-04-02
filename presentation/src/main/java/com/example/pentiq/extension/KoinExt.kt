package com.example.pentiq

import org.koin.core.scope.Scope

inline fun <reified R> Scope.getObject(f: () -> R): R =
        f()

inline fun <reified R, reified T1> Scope.getObject(f: (T1) -> R): R =
        f(get())

inline fun <reified R, reified T1, reified T2> Scope.getObject(f: (T1, T2) -> R): R =
        f(get(), get())

inline fun <reified R, reified T1, reified T2, reified T3> Scope.getObject(f: (T1, T2, T3) -> R): R =
        f(get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4> Scope.getObject(f: (T1, T2, T3, T4) -> R): R =
        f(get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5> Scope.getObject(f: (T1, T2, T3, T4, T5) -> R): R =
        f(get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6> Scope.getObject(f: (T1, T2, T3, T4, T5, T6) -> R): R =
        f(get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> R): R =
        f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> R): R =
	f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22> Scope.getObject(f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> R): R =
	f(get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get(), get())