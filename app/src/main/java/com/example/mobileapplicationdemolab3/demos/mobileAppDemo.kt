package com.example.mobileapplicationdemolab3.demos

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mobileappdemolab3.ComputingLabs.ComputingLabsScreen
import com.example.mobileapplicationdemolab3.Cafeteria.CafeteriaScreen
import com.example.mobileapplicationdemolab3.Library.Library
import com.example.mobileapplicationdemolab3.SportsCentre.SportCentre
import com.example.mobileapplicationdemolab3.StudentSupport.StudentSupportScreen

private enum class CampusPlace(val title: String) {
    Library("Library"),
    ComputingLabs("Computing labs"),
    Cafeteria("Cafeteria"),
    SportsCentre("Sports centre"),
    StudentSupport("Student support")
}

@Composable
fun CampusGuide() {
    var selectedPlace: CampusPlace? by rememberSaveable { mutableStateOf<CampusPlace?>(null) }

    if (selectedPlace == null) {
        CampusMenu(onSelect = { selectedPlace = it })
    } else {
        PlaceScreen(
            place = selectedPlace!!,
            onBack = { selectedPlace = null }
        )
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun CampusMenu(onSelect: (CampusPlace) -> Unit) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Campus Guide") }) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "New to campus? Choose a place below to find opening hours, facilities and contact details.",
                style = MaterialTheme.typography.bodyLarge
            )
            CampusPlace.entries.forEach { place ->
                Button(
                    onClick = { onSelect(place) },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(place.title)
                }
            }
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun PlaceScreen(place: CampusPlace, onBack: () -> Unit) {
    BackHandler(onBack = onBack)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(place.title) },
                navigationIcon = {
                    TextButton(onClick = onBack) { Text("Back") }
                }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .consumeWindowInsets(innerPadding)
        ) {
            when (place) {
                CampusPlace.Library -> Library()
                CampusPlace.ComputingLabs -> ComputingLabsScreen()
                CampusPlace.Cafeteria -> CafeteriaScreen()
                CampusPlace.SportsCentre -> SportCentre()
                CampusPlace.StudentSupport -> StudentSupportScreen()
            }
        }
    }
}