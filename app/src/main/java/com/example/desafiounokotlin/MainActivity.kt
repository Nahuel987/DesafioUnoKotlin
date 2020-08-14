package com.example.desafiounokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    /* DESAFIO UNO KOTLIN */

    // 1 CREAR PROYECTO KOTLIN =>OK
    // 2 CREAR ARCHIVO MAIN.KT =>OK

   /* fun main(){

        println("Hola mundo")
        Log.e("HOLA", "HOLA MUNDO")
    }*/

    // 3 IMPRIMIR MI NOMBRE ES

        var template: String="MI NOMBRE ES => "
        var nombre:String="Nahuel"

        println(template+nombre)

    // 4  Declarar 3 variables numéricas con los valores 10, 20 y 30

        var uno:Int=10
        var dos:Int=20
        var tres:Int=30

    // 5 Imprimir la suma de las 3 variables

        var suma:Int= uno+dos+tres
        println("LA SUMA ES => "+suma)

    // 6  Declarar 1 variable String y otra variable Char

        var str: String
        var cha:Char

    // 7 Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char

        str="Arataka Reigen"
        cha='A'

        // 8  Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable char a otro valor distinto

        println("LA VARIABLE str TIENE => ${str.count()} CARACTERES"  )
        cha='B'

    // 9 Declarar una variable de tipo Float de forma explícita

        var flotador:Float

    // 10 Asignar un valor a la variable Float

        flotador=19.5f

    // 11 Imprimir los valores máximos que pueden almacenar las variables Byte y Short

        val byteMaximo=Byte.MAX_VALUE
        val shortMaximo=Short.MAX_VALUE

        println("LA VARIABLE BYTE PUEDE ALMACENAR COMO MAXIMO => "+ byteMaximo )
        println("LA VARIABLE SHORT PUEDE ALMACENAR COMO MAXIMO => "+ shortMaximo )

    // 12 Imprimir los valores mínimos que pueden almacenar las variables Int y Long

        val intMinimo=Int.MIN_VALUE
        val longMinimo=Long.MIN_VALUE

        println("LA VARIABLE INT PUEDE ALMACENAR COMO MINIMO => "+ intMinimo )
        println("LA VARIABLE LONG PUEDE ALMACENAR COMO MINIMO => "+ longMinimo )

    // 13  Declarar una variable Boolean con true o false e imprimir su valor

        val bool:Boolean=true

        println("EL VALOR ALMACENADO BOOLEAN ES => "+ bool )

    // 14 Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y este
    //imprime el total de caracteres de los dos parámetros

        fun imprimirParametros(nombre:String,apellido:String){

            println("EL NOMBRE      => $nombre Y TIENE  ${nombre.count()} CARACTERES")
            println("EL APELLIDO    => $apellido Y TIENE ${nombre.count()} CARACTERES")

        }

            imprimirParametros("AQUILES","BAEZA")


    // 15 Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%)

        fun obtenerIva(monto:Float,iva:Float){

         var resultado:Float=monto*iva
        println("EL IVA ES => $resultado")

        }

        obtenerIva(100f,0.19f)

    // 16  Desde la función main llamar a estas dos funciones de forma correcta =OK






































    }// onCreate


}//class
