package com.example.main

import com.example.entities.User
import org.springframework.boot.CommandLineRunner
import org.springframework.beans.factory.annotation.Autowired
import com.example.repositories.UserDao
import org.springframework.stereotype.Component

@Component
class Runner : CommandLineRunner {
    @Autowired
    private lateinit var userDao: UserDao

    override fun run(vararg args: String) {
        val user1 = User("Jupiter", "jupiter@example.com")
        val user = userDao.save(user1)
        val retrievedUserOpt = userDao.findById(user.id)
        if (retrievedUserOpt.isPresent) {
            println("Find by Id " + retrievedUserOpt.get())
        }
        userDao.findAll().forEach{u-> println(u)}
    }
}