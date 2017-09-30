package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersona extends AppCompatActivity {
    private EditText cajacedula,cajanombre,cajaapellido;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_persona);
        cajacedula =(EditText)findViewById(R.id.txtcedula);
        cajanombre = (EditText)findViewById(R.id.txtnombre);
        cajaapellido = (EditText)findViewById(R.id.txtapellido);
        res = this.getResources();

    }
    public void guardar(View v){
        String cedula,nombre,apellido;

        cedula = cajacedula.getText().toString();
        nombre = cajanombre.getText().toString();
        apellido = cajaapellido.getText().toString();

        Persona p = new Persona(cedula,nombre,apellido);
        p.guardar();

        Toast.makeText(this,res.getString(R.string.Mensaje_Guardado),Toast.LENGTH_SHORT).show();
        limpiar();

    }

    public  void limpiar(View view){
        limpiar();
    }

    public void limpiar (){
        cajacedula.setText("");
        cajanombre.setText("");
        cajaapellido.setText("");
        cajacedula.requestFocus();
    }

}
