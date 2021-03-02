package com.example.composed

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.composed.pojos.Puppy
import com.example.composed.ui.theme.ComposedTheme

var puppySelected: Puppy?=null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposedTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ComposeNavigation()
                }
            }
        }
    }
}


@Composable
fun NewsStory(navController: NavHostController) {
    MaterialTheme {
        val typography = MaterialTheme.typography
        val state = rememberScrollState();
        Column(
            modifier = Modifier
                .verticalScroll(state)
        ) {
            for (puppy in DataProvider().puppyList) {
                Column(modifier = Modifier
                    .padding(16.dp)
                    .clickable {
                        SecondScreen(navController = navController, puppy = puppy)
                        Log.e("TAG", "onCreate: ")

                    }) {
                    Image(
                        painter = painterResource(id = puppy.image!!),
                        contentDescription = null,
                        modifier = Modifier
                            .height(180.dp)
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(4.dp)),
                        contentScale = ContentScale.FillWidth
                    )
                    Spacer(Modifier.height(16.dp))
                    Text(
                        puppy.name!!,
                        style = typography.h6,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(Modifier.height(16.dp))
                }
            }

        }
    }
}

@Composable
fun Details(navController: NavHostController) {
    MaterialTheme {
        val typography = MaterialTheme.typography
        val state = rememberScrollState();
        Column(
            modifier = Modifier
                .verticalScroll(state)
        ) {

                Column(modifier = Modifier
                    .padding(16.dp)
                    .clickable {
                        SecondScreen(navController = navController, puppy = puppySelected!!)
                        Log.e("TAG", "onCreate: ")

                    }) {
                    Image(
                        painter = painterResource(id = puppySelected!!.image!!),
                        contentDescription = null,
                        modifier = Modifier
                            .height(180.dp)
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(4.dp)),
                        contentScale = ContentScale.FillWidth
                    )
                    Spacer(Modifier.height(16.dp))
                    Text(
                        puppySelected!!.name!!,
                        style = typography.h6,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(Modifier.height(16.dp))
                    Text(
                        puppySelected!!.description!!,
                        style = typography.body2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }


    }
}

@Composable
fun ComposeNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "first_screen"
    ) {
        composable("first_screen") {
            NewsStory(navController = navController)
        }
        composable("second_screen") {
            Details(navController = navController)
        }
    }
}

//@Composable
fun SecondScreen(navController: NavHostController, puppy: Puppy) {
    puppySelected=puppy
    navController.navigate("second_screen")
}

