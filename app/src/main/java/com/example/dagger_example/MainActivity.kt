package com.example.dagger_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dagger_example.data.di.components.ActivityComponent
import com.example.dagger_example.data.di.scopes.ActivityScope
import com.example.dagger_example.domain.di.PresenterInterface
import com.example.dagger_example.ui.theme.Dagger2ExampleTheme
import javax.inject.Inject

@ActivityScope
class MainActivity : ComponentActivity() {
    private lateinit var activityComponent: ActivityComponent

    @Inject
    lateinit var presenter: PresenterInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityComponent = (application as ExampleApp).appComponent.activityComponent()
        activityComponent.inject(this)

        enableEdgeToEdge()
        setContent {
            Dagger2ExampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Dagger2ExampleTheme {
        Greeting("Android")
    }
}