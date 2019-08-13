package com.team_jam.myapplication.ui.base

import androidx.appcompat.app.AppCompatActivity
import com.team_jam.myapplication.data.repository.RepositoryFactory


open class BaseActivity : AppCompatActivity() {

    val repositoryFactory = RepositoryFactory()
}