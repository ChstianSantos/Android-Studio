<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/bw"
    tools:context=".MainActivity">

    <View
        android:id="@+id/conteinerCadastro"
        android:layout_width="376dp"
        android:layout_height="699dp"
        android:layout_marginHorizontal="20dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/txtTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Cadastro"
        android:textSize="25sp"
        android:textColor="@color/blue"
        android:textStyle="bold"
        android:layout_marginTop="30dp"
        app:layout_constraintTop_toTopOf="@id/conteinerCadastro"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"/>

    <TextView
        android:id="@+id/txtDesc"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="4dp"
        android:text="Faça o cadastro!"
        android:textColor="@color/blue"
        android:textSize="18sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        app:layout_constraintHorizontal_bias="0.495"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintTop_toBottomOf="@id/txtTitle" />

    <EditText
        android:id="@+id/editTextName"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="text"
        android:hint="Nome"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/txtDesc"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="16dp"/>

    <EditText
        android:id="@+id/editTextAge"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="number"
        android:hint="Idade"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/editTextName"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="8dp"/>

    <EditText
        android:id="@+id/editTextGender"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="text"
        android:hint="Sexo"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/editTextAge"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="8dp"/>

    <EditText
        android:id="@+id/editTextNationality"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="text"
        android:hint="Nacionalidade"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/editTextGender"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="8dp"/>

    <EditText
        android:id="@+id/editTextStreet"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="text"
        android:hint="Rua"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/editTextNationality"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="8dp"/>

    <EditText
        android:id="@+id/editTextNeighborhood"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="text"
        android:hint="Bairro"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/editTextStreet"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="8dp"/>

    <EditText
        android:id="@+id/editTextState"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="text"
        android:hint="Estado"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/editTextNeighborhood"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="8dp"/>

    <EditText
        android:id="@+id/editTextNumber"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="number"
        android:hint="Número"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/editTextState"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="8dp"/>

    <EditText
        android:id="@+id/editTextComplement"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="text"
        android:hint="Complemento"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/editTextNumber"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="8dp"/>

    <EditText
        android:id="@+id/editTextShoes"
        android:layout_width="196dp"
        android:layout_height="43dp"
        android:ems="10"
        android:inputType="text"
        android:hint="Chinelo ou Tênis"
        android:textColorHint="@color/blue"
        app:layout_constraintTop_toBottomOf="@id/editTextComplement"
        app:layout_constraintStart_toStartOf="@id/conteinerCadastro"
        app:layout_constraintEnd_toEndOf="@id/conteinerCadastro"
        android:layout_marginTop="8dp"/>

</androidx.constraintlayout.widget.ConstraintLayout>
