<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp">

    <!-- Campo para inserir a altura -->
    <TextView
        android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Calculando PESINHO do angrybids"
        android:textAlignment="center"
        android:textColor="#E20E0E"
        android:textSize="18sp"
        android:textStyle="bold|italic"
        android:typeface="serif"
        tools:ignore="HardcodedText" />

    <EditText
        android:id="@+id/editTextAltura"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Digite sua altura (em metros)"
        android:inputType="numberDecimal"
        android:layout_marginTop="10dp"
        app:layout_constraintTop_toTopOf="@id/textView"
        tools:ignore="HardcodedText" />

    <EditText
        android:id="@+id/editTextPeso"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Digite seu peso (em kg)"
        android:inputType="numberDecimal"
        android:layout_marginTop="10dp"
        app:layout_constraintTop_toTopOf="@id/editTextAltura"
        tools:ignore="HardcodedText" />

    <TextView
        android:id="@+id/textViewResultado"
        android:layout_width="210sp"
        android:layout_height="39dp"
        android:layout_marginStart="67dp"
        android:layout_marginTop="15dp"
        android:text="Seu IMC aparecerá aqui"
        android:textSize="18sp"
        tools:ignore="HardcodedText" />

    <Button
        android:id="@+id/buttonCalcular"
        android:layout_width="356dp"
        android:layout_height="68dp"
        android:backgroundTint="#E70C0C"
        android:text="Calcular IMC"
        android:textColor="#F8F4F4"
        android:textSize="20sp"
        app:rippleColor="#FFFFFF"
        tools:ignore="HardcodedText" />

</LinearLayout>
