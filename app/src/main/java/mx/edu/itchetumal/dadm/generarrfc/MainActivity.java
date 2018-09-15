package mx.edu.itchetumal.dadm.generarrfc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GeneraRFC(View v){
        //Tomar la primer letra y primer vocal del apellido paterno
        EditText edApPaterno = (EditText) findViewById(R.id.edtApPaterno);
        char primerLetraAP = edApPaterno.getText().charAt(0);


        char[] vocales = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        String cadAux = "Pedro Pérez";
        char primerLetra = cadAux.charAt(0);

        Character LetraAp = new Character(cadAux.charAt(0));
        LetraAp.

        //Tomar la primer letra del apellido materno


        //Tomar la primer letra del primer nombre


        //Tomar los últimos dígitos del año de nacimiento


        //Tomar los dos dígitos del mes de nacimiento


        //Tomar los dos dígitos del día de nacimiento


        //Generar 3 caracteres (letras mayúsculas o números) para la Homonimia


        //Concatenar lo anterior y mostrar el RFC
    }

}
