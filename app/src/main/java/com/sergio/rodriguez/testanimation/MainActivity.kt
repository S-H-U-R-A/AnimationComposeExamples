package com.sergio.rodriguez.testanimation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sergio.rodriguez.testanimation.animaciones.InfiniteColorAnimation
import com.sergio.rodriguez.testanimation.animationLowLevel.ExampleAnimatableBasic
import com.sergio.rodriguez.testanimation.ui.theme.TestAnimationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestAnimationTheme {

                if(BuildConfig.BUILD_TYPE == "debug") {
                    InfiniteColorAnimation()
                }

                if(BuildConfig.FLAVOR  == "free"){
                    InfiniteColorAnimation()
                }else{
                    ExampleAnimatableBasic()
                }

                val url = BuildConfig.SHOW_POPUP
                Log.d("MainActivity", "MOSTRAR POPUP: $url")

            }
        }
    }
}


@Preview(
    showSystemUi = true,
)
@Composable
fun AnimatedVisibilityPreview() {
    TestAnimationTheme {

        /*Animaciones de visibilidad */
        //AnimatedVisibilityBasic("Click me")
        //AnimatedVisibilityCustom("Click me")
        //AnimatedVisibilityWitLifeCycle("Click me")
        //AnimatedVisibilitySecondaryElements("Click me")
        //AnimatedVisibilitySecondaryElementsCustom("Click me")

        /*Animaciones a partir de estados o valores*/
        //AnimateAsStateFloat("Click me")
        //AnimateAsStateColor("Click me")
        //AnimateAsStateColorCustom("Click me")

        /*Animaciones del contenido de un composable usando
          el valor del estado en el mismo composable
        */
        //AnimateContentBasic("Click me")
        //AnimateContentCustom("Click me")
        //AnimateContentCustomAdvance("Click me")

        /*Animaciones para el cambio de tamaño de un composable*/
        //AnimatedContentSize("Click me")

        /*Animaciones para intercambiar composables con una animación suave*/
        //AnimatedCrossfade("Click me")

        /*Animaciones para actualizar un composable con una animación suave, sin la necesidad de usar un composable de animación*/
        //AnimatedUpdateTransitionBasic()
        //AnimatedUpdateTransitionImmediately()
        //AnimatedUpdateTransitionWithAnimatedVisibilityOrAnimatedContent(name = "Visisble And Content")
        //AnimatedReuseAnimationWithObjectTransition()

        /*Animaciones infinitas*/
        //InfiniteColorAnimation()

        /*Animaciones de Bajo nivel*/
        ExampleAnimatableBasic()
    }
}