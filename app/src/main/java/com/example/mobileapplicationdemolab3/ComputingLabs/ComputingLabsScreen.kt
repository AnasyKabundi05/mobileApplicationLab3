package com.example.mobileappdemolab3.ComputingLabs

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
fun ComputingLabsScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Computing Labs",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "The computing labs give students access to high-spec PCs with the software needed for their courses. " +
                    "Labs are used for timetabled classes and are open for independent work outside class times."
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
                Text("Location: Labs C101 – C106, Engineering Building")
                Text("Email: itsupport@campus.ie")
                Text("Phone: 061 123 321")
                Text("Open access: Monday – Friday, 08:00 – 20:00")
            }
        }
    }
}