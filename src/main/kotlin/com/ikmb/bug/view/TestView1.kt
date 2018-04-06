package com.ikmb.bug.view

import javafx.animation.PauseTransition
import javafx.geometry.Pos
import tornadofx.*

class TestView1 : View("My View") {
    override val root = borderpane {
        center{
            vbox {
                alignment = Pos.CENTER
                button("open"){
                    action {
                        TestView2().openWindow()
                        val timeout= PauseTransition(3.0.seconds)
                        timeout.setOnFinished {
                            runLater {
                                find(TestView2::class).close()
                            }
                        }
                        timeout.playFromStart()
                    }
                }
                button("find(DemoWorkspace::class).dock()"){
                    action {
                        find(DemoWorkspace::class).dock(TestView2(),true)
                    }
                }
                button("workspace.dock"){
                    action {
                        workspace.dock(TestView2(),true)
                        println("workspace.dock(): workspace.viewstack.size=${workspace.viewStack.size}")
                    }
                }
                button("close"){
                    action {
                        find(TestView2::class).close()
                    }
                }
            }
        }
    }
}
