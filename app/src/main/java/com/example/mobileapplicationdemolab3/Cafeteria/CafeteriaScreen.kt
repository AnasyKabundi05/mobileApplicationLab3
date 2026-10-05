package com.example.mobileapplicationdemolab3.Cafeteria

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CafeteriaScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Cafeteria",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "The campus cafeteria serves hot meals, sandwiches, snacks and drinks throughout the day. " +
                    "Vegetarian, vegan and gluten-free options are available, and there's plenty of seating for groups."
        )

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Contact",
                    style = MaterialTheme.typography.titleMedium
                )
                Text("Location: Ground floor, Student Centre")
                Text("Email: catering@campus.ie")
                Text("Phone: 061 123 654")
                Text("Hot food: Monday – Friday, 12:00 – 14:30")
            }
        }
    }
}