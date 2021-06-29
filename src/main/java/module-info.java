module ru.sber.mainppmodule {
    
    requires ru.sber.entitymodule;
    requires ru.sber.daomodule;
    requires ru.sber.userdaomodule;
    uses ru.sber.userdaomodule.UserDao;
    
}
