package com.example.mobileapplicationdemolab3.SportsCentre

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
fun SportCentre(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Sports Centre"
        )

        Text(
            text = "The campus sports centre has a fully equipped gym, sports hall and all-weather pitches. " +
                    "Students can join clubs, book facilities or drop in for fitness classes throughout the week."
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
                Text("Location: Sports Building, beside the main car park")
                Text("Email: sports@campus.ie")
                Text("Phone: 061 123 789")
                Text("Reception: Monday – Friday, 07:00 – 22:00")
            }
        }
    }
}