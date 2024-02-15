package com.twity.mp23.todoapp

//Sealed es para sellar la clase
sealed class TaskCatogory {
    object Personal : TaskCatogory()
    object Business : TaskCatogory()
    object Other : TaskCatogory()
}

