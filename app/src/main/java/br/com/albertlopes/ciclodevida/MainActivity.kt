package br.com.albertlopes.ciclodevida

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var mainViewlModel: MainViewlModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewlModel = ViewModelProviders.of(this).get(MainViewlModel::class.java)

        atualizarPlacarCasa()
        atualizarPlacarVisitante()

        btCasa.setOnClickListener(){

            mainViewlModel.placarCasa += 1
            atualizarPlacarCasa()
        }

        btVisitante.setOnClickListener(){
            mainViewlModel.placarVisitante += 1
            atualizarPlacarVisitante()
        }


    }

    private fun atualizarPlacarCasa(){
        tvCasa.setText(mainViewlModel.placarCasa.toString())

    }


    private fun atualizarPlacarVisitante(){
        tvVisitante.setText(mainViewlModel.placarVisitante.toString())
    }
}
