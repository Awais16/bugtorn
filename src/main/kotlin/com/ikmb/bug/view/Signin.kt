package com.ikmb.bug.view

import tornadofx.*

class Signin : View("My View") {
    override val root = borderpane {
        center{
            form {
                fieldset {
                    field ("username"){
                        textfield ()
                    }
                }
                button("login"){
                    action {
                        replaceWith(DemoWorkspace())
                    }
                }
            }
        }
    }
}
