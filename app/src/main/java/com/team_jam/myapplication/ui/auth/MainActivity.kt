package com.team_jam.myapplication.ui.auth

import android.os.Bundle
import androidx.lifecycle.Observer
import com.team_jam.myapplication.R
import com.team_jam.myapplication.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    lateinit var mViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = MainViewModel(repositoryFactory.userRepo)

        mViewModel.getUsers().observe(this, Observer {
            println(it.data)
        })
    }
}
