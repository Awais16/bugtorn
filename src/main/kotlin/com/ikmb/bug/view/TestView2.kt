package com.ikmb.bug.view

import tornadofx.*

class TestView2 : Fragment("My View") {
    override val root = borderpane {
        prefWidth = 200.0
        prefHeight = 200.0
        center{
            label("Popup closes in 3 seconds!")
        }
    }
}
