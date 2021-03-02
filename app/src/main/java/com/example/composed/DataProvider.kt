package com.example.composed


import com.example.composed.pojos.Puppy
import java.util.ArrayList
import com.example.composed.R

class DataProvider {
    val puppyList: List<Puppy>
        get() {
            val puppyList: MutableList<Puppy> = ArrayList()
            var puppy = Puppy()
            puppy.image = R.drawable.orange_dog
            puppy.name = "Hachiko"
            puppy.description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,"
            puppyList.add(puppy)
          puppy = Puppy()
            puppy.image = R.drawable.blue_dog
            puppy.name = "Skooby Doo"
            puppy.description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,"
            puppyList.add(puppy)
      puppy = Puppy()
            puppy.image = R.drawable.red_dog
            puppy.name = "Miss Agnes"
            puppy.description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,"
            puppyList.add(puppy)
       puppy = Puppy()
            puppy.image = R.drawable.yellow_dog
            puppy.name = "Cyrus"
            puppy.description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,"
            puppyList.add(puppy)
       puppy = Puppy()
            puppy.image = R.drawable.white_dog
            puppy.name = "Shelby"
            puppy.description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,"
            puppyList.add(puppy)
            return puppyList
        }
}