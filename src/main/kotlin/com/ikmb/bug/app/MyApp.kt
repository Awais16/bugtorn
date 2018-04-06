package com.ikmb.bug.app

import com.ikmb.bug.view.DemoWorkspace
import com.ikmb.bug.view.Signin
import javafx.stage.Stage
import tornadofx.App

class MyApp: App(Signin::class, Styles::class){

    override fun start(stage: Stage) {
        super.start(stage)
        stage.isMaximized = true
    }
}