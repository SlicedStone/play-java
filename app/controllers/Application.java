package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok("hello world from play framework by freeBSD, enjoy it");
    }

}
