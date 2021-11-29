package com.example.voteintention.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.voteintention.R
import com.example.voteintention.databinding.ActivityMainBinding
import com.example.voteintention.view.fragments.AcceptionByAgeFragment
import com.example.voteintention.view.fragments.AcceptionByGenderFragment
import com.example.voteintention.view.fragments.AcceptionBySalaryFragment
import com.example.voteintention.view.fragments.MainFragment
import com.example.voteintention.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var bind:ActivityMainBinding
    private lateinit var viewModel:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        fragmentManager(MainFragment())
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater:MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_fragments, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.fragment_bygender -> fragmentManager(AcceptionByGenderFragment())
            R.id.fragment_byage -> fragmentManager(AcceptionByAgeFragment())
            R.id.fragment_bysalary -> fragmentManager(AcceptionBySalaryFragment())
            else -> super.onOptionsItemSelected(item)

        }

    }

    private fun fragmentManager(fragment:Fragment):Boolean{
        val fragmentTransation = supportFragmentManager.beginTransaction()
        fragmentTransation.replace(R.id.frame_container_fragment, fragment)
        fragmentTransation.commit()
        return true
    }
}