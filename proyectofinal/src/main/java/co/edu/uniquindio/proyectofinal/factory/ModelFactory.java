package co.edu.uniquindio.proyectofinal.factory;

import co.edu.uniquindio.proyectofinal.model.MarketPlace;
import co.edu.uniquindio.proyectofinal.service.IModelFactoryService;

import java.io.Serializable;

public class ModelFactory  implements IModelFactoryService {
    private static ModelFactory instance;
    MarketPlace marketPlace;

}
