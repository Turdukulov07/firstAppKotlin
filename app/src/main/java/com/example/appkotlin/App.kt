package com.example.appkotlin

class App {

    companion object {
        private  val list : ArrayList<String> = ArrayList()

        fun addList(name: String) {
            list.add(name)
        }

        fun getList(): ArrayList<String> {
            return list
        }
    }

}