package com.example.exampleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.exampleapp.databinding.ActivityMainBinding
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate




class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*var myChart: PieChart = binding.pieChart1

        var dataList: ArrayList<PieEntry> = arrayListOf()

        for(i in 0 until 5){
            dataList.add(PieEntry((Math.random() *5+5).toFloat()))
        }

        val dataSet = PieDataSet(dataList, "Resultados")

        val data = PieData(dataSet)
        myChart.setData(data)*/


    }
    fun genGrpgh (view: View){

       val datosGraph=binding.ValueGraph.text.split(",");
        var myChart: PieChart = binding.pieChart1

        var dataList: ArrayList<PieEntry> = arrayListOf()

        for(i in 0 until datosGraph.size){
            dataList.add(PieEntry((datosGraph[i]).toFloat()))
        }

       /* for(i in 0 until 5){
            dataList.add(PieEntry((Math.random() *5+5).toFloat()))
        }*/

        myChart.animateXY(1000,1000)

        var colores: ArrayList<Int> = arrayListOf()


        /*for(i in 0 until datosGraph.size){
            colores.add(Color.parseColor(Integer.toHexString((Math.random()+10).toInt())))
      }*/

        for (c in ColorTemplate.COLORFUL_COLORS) colores.add(c)

        val dataSet = PieDataSet(dataList, "Resultados")
        dataSet.setColors(colores)

        val data = PieData(dataSet)
        myChart.setData(data)


    }

}