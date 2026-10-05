package com.example.mobileapplicationdemolab3.Library

import android.icu.text.CaseMap
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Library(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text("Description\n" +
                "The campus library is a quiet space to study, borrow books and get help with research. It offers individual and group study areas, computers, printing, and access to online journals and e-books.\n")

        Card() {
            "Location: Ground floor, Main Building\n" +
                    "Email: library@campus.ie\n" +
                    "Phone: 061 123 456\n" +
                    "Help desk: Monday – Friday, 09:00 – 17:00"
        }
    }

}