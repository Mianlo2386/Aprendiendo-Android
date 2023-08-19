package com.curso.android.app.cursodeandroid.todoapp

sealed class TaskCategory {
    object Business:TaskCategory()
    object Personal:TaskCategory()
    object Other:TaskCategory()
}

