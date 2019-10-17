package com.example.bmic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
/**
 * Activity for loading layout resources
 * @author Paulo Ramirez Leon
*
 * */
Spinner spinner;
    IMC categoria;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Inicializar();
btnCalcularIMC();

    }

    /**
     * Metodo que se llama para ejecutar el metodo por boton
     */
    public void btnCalcularIMC(){
        Button btnCalcularIMCResult = findViewById(R.id.button);
        btnCalcularIMCResult.setOnClickListener(new BtnCalcularIhMCEscuchador());
    }

    public void myButtonListenerMethod() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText heightText = findViewById(R.id.heightInput);
                String  heightStr = heightText.getText().toString();
                double height = Double.parseDouble(heightStr);
                final EditText weightText = findViewById(R.id.weightInput);
                String  weightStr = weightText.getText().toString();
                double weight = Double.parseDouble(weightStr);
                double BMI = (weight)/(height*height);

                final EditText BMIResult = findViewById(R.id.bmiResult);
                BMIResult.setText(Double.toString(BMI));
                String BMI_Cat;

                if (BMI < 15)
                    BMI_Cat = "Very severely underweight";
                else if (BMI < 16)
                    BMI_Cat = "Severely underweight";
                else if (BMI < 18.5)BMI_Cat = "Underweight";
                else if (BMI < 25)BMI_Cat = "Normal";
                else if (BMI < 30)BMI_Cat = "Overweight";
                else if (BMI < 35)BMI_Cat = "Obese Class 1 -Moderately Obese";
                else if (BMI < 40)BMI_Cat = "Obese Class 2 -Severely Obese";
                else
                    BMI_Cat = "Obese Class 3 -Very Severely Obese";

                final TextView BMICategory = findViewById(R.id.BMICategory);
                BMICategory.setText(BMI_Cat);
            }
        });

    }

    private Double calcularIMC(Double pesoDbl, Double estaturaDbl){
        Double imc = pesoDbl / (estaturaDbl * estaturaDbl);
        return imc;
    }
    /**
    * Metodo que calcula la categoria a partir del IMC
    *
    * @param imc Indice de Masa Corporal en formato Double
     *El return categoria calculada en formato de cadena de texto (String)
    * */
    private  String getBMICategoria(Double imc){
        String sp1 = spinner.getSelectedItem().toString();
        String tntEdad = editText.getText().toString();
        int Edad = Integer.parseInt(tntEdad);
if (sp1.equals("Hombre")){
    if (Edad >= 1 && Edad < 5){
        if (imc < 5.7){
            categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.0){
            categoria = IMC.SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.2){
            categoria = IMC.UNDER_WEIGHT;
        }else if (imc < 7.0 ){
            categoria = IMC.NORMAL;
        }else if (imc < 7.8 ){
            categoria = IMC.OVER_wEIGHT;
        }else if (imc < 8.7 ){
            categoria = IMC.MODERATELY_OBESE;
        }else if (imc < 8.9 ) {
            categoria = IMC.SEVERELY_OBESE;
        }else {
            categoria = IMC.VERY_SEVERELY_OBESE;
        }

    }else if (Edad >= 5 && Edad <= 11){
        if (imc < 5.7){
            categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.0){
            categoria = IMC.SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.2){
            categoria = IMC.UNDER_WEIGHT;
        }else if (imc < 7.0 ){
            categoria = IMC.NORMAL;
        }else if (imc < 7.8 ){
            categoria = IMC.OVER_wEIGHT;
        }else if (imc < 8.7 ){
            categoria = IMC.MODERATELY_OBESE;
        }else if (imc < 8.9 ) {
            categoria = IMC.SEVERELY_OBESE;
        }else {
            categoria = IMC.VERY_SEVERELY_OBESE;
        }
    }else if (Edad >= 12 && Edad <= 19){
        if (imc < 5.7){
            categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.0){
            categoria = IMC.SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.2){
            categoria = IMC.UNDER_WEIGHT;
        }else if (imc < 7.0 ){
            categoria = IMC.NORMAL;
        }else if (imc < 7.8 ){
            categoria = IMC.OVER_wEIGHT;
        }else if (imc < 8.7 ){
            categoria = IMC.MODERATELY_OBESE;
        }else if (imc < 8.9 ) {
            categoria = IMC.SEVERELY_OBESE;
        }else {
            categoria = IMC.VERY_SEVERELY_OBESE;
        }
    }else if (Edad >= 20 && Edad <= 59){
        if (imc < 5.7){
            categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.0){
            categoria = IMC.SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.2){
            categoria = IMC.UNDER_WEIGHT;
        }else if (imc < 7.0 ){
            categoria = IMC.NORMAL;
        }else if (imc < 7.8 ){
            categoria = IMC.OVER_wEIGHT;
        }else if (imc < 8.7 ){
            categoria = IMC.MODERATELY_OBESE;
        }else if (imc < 8.9 ) {
            categoria = IMC.SEVERELY_OBESE;
        }else {
            categoria = IMC.VERY_SEVERELY_OBESE;
        }
    }else if (Edad >= 60 && Edad >= 70){
        if (imc < 5.7){
            categoria = IMC.VERY_SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.0){
            categoria = IMC.SEVERELY_UNDER_WEIGHT;
        }else if (imc < 6.2){
            categoria = IMC.UNDER_WEIGHT;
        }else if (imc < 7.0 ){
            categoria = IMC.NORMAL;
        }else if (imc < 7.8 ){
            categoria = IMC.OVER_wEIGHT;
        }else if (imc < 8.7 ){
            categoria = IMC.MODERATELY_OBESE;
        }else if (imc < 8.9 ) {
            categoria = IMC.SEVERELY_OBESE;
        }else {
            categoria = IMC.VERY_SEVERELY_OBESE;
        }
    }


}else {
    if (Edad >= 1 && Edad < 5){

    }else if (Edad >= 5 && Edad <= 11){

    }else if (Edad >= 12 && Edad <= 19){

    }else if (Edad >= 20 && Edad <= 59){

    }else if (Edad >= 60 && Edad >= 70){

    }

}

        return  IMCEnum.getValue(categoria);
    }
    public void Inicializar(){
         spinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
         editText = (EditText) findViewById(R.id.edEdad);
    }


    class  BtnCalcularIhMCEscuchador implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            EditText txtEstatura = findViewById(R.id.heightInput);
            EditText txtPeso = findViewById(R.id.weightInput);
            TextView BMIResultado = findViewById(R.id.bmiResult);
            TextView BMICategoria = findViewById(R.id.BMICategory);

            String estaturaStr = txtEstatura.getText().toString();
            String pesoStr = txtPeso.getText().toString();
            Double estaturaDbl = Double.parseDouble(estaturaStr);
            Double pesoDbl = Double.parseDouble(pesoStr);
            Double imc = calcularIMC(pesoDbl, estaturaDbl);

            BMIResultado.setText(Double.toString(imc));
            BMICategoria.setText(getBMICategoria(imc));
        }
    }


}
