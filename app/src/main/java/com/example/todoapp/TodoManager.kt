package com.example.todoapp

import java.time.Instant
import java.util.Date

object TodoManager {

    private val todoList = mutableListOf(
        Todo(1, "Prepare for Dsa", Date.from(Instant.now())),
        Todo(2, "Take Medicine after workout", Date.from(Instant.now())),
        Todo(3, "Study for exams", Date.from(Instant.now())),
        Todo(4, "Visit Doctor", Date.from(Instant.now())),
        Todo(5, "Sleep in time", Date.from(Instant.now())),
        Todo(6, "Go to Doctor", Date.from(Instant.now())),
    )


    fun getAllTodo() : List<Todo>{
        return todoList
    }

    fun addTodo(title : String){
        todoList.add(Todo(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }

    fun deleteTodo(id : Int){
        todoList.removeIf{
            it.id==id
        }
    }

}