package com.example.gestordeeventos;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class AdicionarEventoActivity extends AppCompatActivity {

    MemoryEventoDAO memoryEventoDAO = new MemoryEventoDAO();

    List<Evento> arrayevents = memoryEventoDAO.getALL();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_evento);

    }


  private boolean addEvent(){

      EditText descricao = (EditText) findViewById(R.id.descricao);
      descricao.getText();

      EditText local = (EditText) findViewById(R.id.local);
      descricao.getText();

      EditText numeroLugares = (EditText) findViewById(R.id.numeroLugares);
      descricao.getText();

      EditText preco = (EditText) findViewById(R.id.preco);
      descricao.getText();

      Button botaoConfirmar = (Button) findViewById(R.id.botaoConfirmar);

      /*Evento evento = new Evento();
      arrayevents.add(evento);*/

      return false;

  }

}



