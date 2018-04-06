package com.ikmb.bug.view

import tornadofx.*

class DemoWorkspace : Workspace("Hello Workspace") {

    init {
        dock(TestView1(),true)
        //workspace.dock(TestView1(),true)
        println("workspace.viewStack.size =${workspace.viewStack.size}")

        with(bottomDrawer) {
            item( "System Log") {
                textarea {
                    addClass("consola")
                }
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        dock(TestView2())
    }
}