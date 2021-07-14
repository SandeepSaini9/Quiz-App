package com.sandeep.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion() : ArrayList<QuestionData>{
        var que : ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(

            id =1,
            "What is the capital of Bangladesh?",
            "Kathmandu",
            "Dhaka",
            "Delhi",
            "Islamabad",
            2
        )
        var question2 = QuestionData(

            id =2,
            "What is the capital of UAE?",
            "Abu Dhabi",
            "Quatar",
            "Saudi Arabia",
            "Dubai",
            4
        )
        var question3 = QuestionData(

            id =3,
            "What is the capital of Uzbekistan?",
            "Tashkent",
            "Bukhara",
            "Kokand",
            "Samarkand",
            1
        )
        var question4 = QuestionData(

            id =4,
            "What is the capital of England?",
            "Kathmandu",
            "London",
            "New York",
            "Tibet",
            2
        )
        var question5 = QuestionData(

            id =5,
            "What is the capital of Sri Lanka?",
            "Dhaka",
            "Nauru",
            "Colombo",
            "Tibet",
            3
        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }

}