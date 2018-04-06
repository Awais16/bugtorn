package com.ikmb.bug.view

import tornadofx.*

class DemoWorkspace : Workspace("Hello Workspace") {

    init {
        dock(TestView1(),true)
        //workspace.dock(TestView1(),true)
        println("workspace.viewStack.size =${workspace.viewStack.size}")


        //to test opeModel closing recursive ui bug.
        with(bottomDrawer) {
            item( "System Log") {
                textarea {
                    addClass("consola")
                }
            }
        }
    }

}