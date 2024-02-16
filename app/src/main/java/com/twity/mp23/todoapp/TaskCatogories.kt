package com.twity.mp23.todoapp

//Sealed es para sellar la clase
sealed class TaskCategory (var isSelected:Boolean = true){
    object Personal : TaskCategory()
    object Business : TaskCategory()
    object Other : TaskCategory()
}

