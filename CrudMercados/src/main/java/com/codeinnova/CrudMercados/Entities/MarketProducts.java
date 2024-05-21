package com.codeinnova.CrudMercados.Entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class MarketProducts {

    private boolean manzanas;
    private boolean bananos;
    private boolean naranjas;
    private boolean uvas;
    private boolean fresas;
    private boolean sandias;
    private boolean mangos;
    private boolean pinas;
    private boolean limones;
    private boolean peras;
    private boolean melocotones;
    private boolean kiwis;
    private boolean melones;
    private boolean cerezas;
    private boolean papayas;
    private boolean mora;
    private boolean uchuvas;
    private boolean maracuya;
    private boolean mandarina;
    private boolean coco;
    private boolean tomates;
    private boolean zanahorias;
    private boolean cebollas;
    private boolean cebolleta;
    private boolean lechugas;
    private boolean pepinos;
    private boolean pimientos;
    private boolean espinacas;
    private boolean brocoli;
    private boolean papas;
    private boolean platanos;
    private boolean champinones;
    private boolean apio;
    private boolean ajo;
    private boolean maiz;
    private boolean repollo;
    private boolean zucchini;
    private boolean zapallo;
    private boolean remolacha;
    private boolean rabano;
    private boolean aguacate;
    private boolean acelga;
    private boolean puerro;
    private boolean coliflor;
    private boolean habichuela;
    private boolean res;
    private boolean cerdo;
    private boolean pollo;
    private boolean pescado;
    private boolean ternera;
    private boolean cordero;
    private boolean conejo;
    private boolean pavo;
    private boolean jamon;
    private boolean salchichas;
    private boolean chorizo;
    private boolean longaniza;
    private boolean butifarra;
    private boolean morcilla;
    private boolean bufalo;
    private boolean leche;
    private boolean queso;
    private boolean yogurt;
    private boolean mantequilla;
    private boolean CremaDeLeche;
    private boolean lecheCondensada;
    private boolean helado;
    private boolean cuajada;
    private boolean sueroDeLeche;
    private boolean panTajado;
    private boolean arroz;
    private boolean pasta;
    private boolean garbanzos;
    private boolean frijoles;
    private boolean arveja;
    private boolean lentejas;
    private boolean nueces;
    private boolean almendras;
    private boolean perejil;
    private boolean cilantro;
    private boolean albahaca;
    private boolean pimienta;
    private boolean oregano;
    private boolean tomillo;
    private boolean laurel;
    private boolean canela;
    private boolean aceites; // (olive, sunflower, coconut)
    private boolean vinagres; // (balsamic, wine, apple cider)
    private boolean atunEnlatado;
    private boolean sardinasEnlatadas;
    private boolean condimentos; // (mustard, ketchup, mayonnaise)
    private boolean vinagretas;
    private boolean harinas;
    private boolean azucar;
    private boolean sal;

    //CONTRUCTORES

    public MarketProducts() {
    }

    public MarketProducts(boolean manzanas, boolean bananos, boolean naranjas, boolean uvas, boolean fresas,
                          boolean sandias, boolean mangos, boolean pinas, boolean limones, boolean peras,
                          boolean melocotones, boolean kiwis, boolean melones, boolean cerezas, boolean papayas,
                          boolean mora, boolean uchuvas, boolean maracuya, boolean mandarina, boolean coco,
                          boolean tomates, boolean zanahorias, boolean cebollas, boolean cebolleta, boolean lechugas,
                          boolean pepinos, boolean pimientos, boolean espinacas, boolean brocoli, boolean papas,
                          boolean platanos, boolean champinones, boolean apio, boolean ajo, boolean maiz,
                          boolean repollo, boolean zucchini, boolean zapallo, boolean remolacha, boolean rabano,
                          boolean aguacate, boolean acelga, boolean puerro, boolean coliflor, boolean habichuela,
                          boolean res, boolean cerdo, boolean pollo, boolean pescado, boolean ternera, boolean cordero,
                          boolean conejo, boolean pavo, boolean jamon, boolean salchichas, boolean chorizo,
                          boolean longaniza, boolean butifarra, boolean morcilla, boolean bufalo,
                          boolean leche, boolean queso, boolean yogurt, boolean mantequilla, boolean CremaDeLeche,
                          boolean lecheCondensada, boolean helado, boolean cuajada, boolean sueroDeLeche, boolean panTajado,
                          boolean arroz, boolean pasta, boolean garbanzos, boolean frijoles, boolean arveja, boolean lentejas,
                          boolean nueces, boolean almendras, boolean perejil, boolean cilantro, boolean albahaca,
                          boolean pimienta, boolean oregano, boolean tomillo, boolean laurel, boolean canela, boolean aceites,
                          boolean vinagres, boolean atunEnlatado, boolean sardinasEnlatadas, boolean condimentos,
                          boolean vinagretas, boolean harinas, boolean azucar, boolean sal) {
        this.manzanas = manzanas;
        this.bananos = bananos;
        this.naranjas = naranjas;
        this.uvas = uvas;
        this.fresas = fresas;
        this.sandias = sandias;
        this.mangos = mangos;
        this.pinas = pinas;
        this.limones = limones;
        this.peras = peras;
        this.melocotones = melocotones;
        this.kiwis = kiwis;
        this.melones = melones;
        this.cerezas = cerezas;
        this.papayas = papayas;
        this.mora = mora;
        this.uchuvas = uchuvas;
        this.maracuya = maracuya;
        this.mandarina = mandarina;
        this.coco = coco;
        this.tomates = tomates;
        this.zanahorias = zanahorias;
        this.cebollas = cebollas;
        this.cebolleta = cebolleta;
        this.lechugas = lechugas;
        this.pepinos = pepinos;
        this.pimientos = pimientos;
        this.espinacas = espinacas;
        this.brocoli = brocoli;
        this.papas = papas;
        this.platanos = platanos;
        this.champinones = champinones;
        this.apio = apio;
        this.ajo = ajo;
        this.maiz = maiz;
        this.repollo = repollo;
        this.zucchini = zucchini;
        this.zapallo = zapallo;
        this.remolacha = remolacha;
        this.rabano = rabano;
        this.aguacate = aguacate;
        this.acelga = acelga;
        this.puerro = puerro;
        this.coliflor = coliflor;
        this.habichuela = habichuela;
        this.res = res;
        this.cerdo = cerdo;
        this.pollo = pollo;
        this.pescado = pescado;
        this.ternera = ternera;
        this.cordero = cordero;
        this.conejo = conejo;
        this.pavo = pavo;
        this.jamon = jamon;
        this.salchichas = salchichas;
        this.chorizo = chorizo;
        this.longaniza = longaniza;
        this.butifarra = butifarra;
        this.morcilla = morcilla;
        this.bufalo = bufalo;
        this.leche = leche;
        this.queso = queso;
        this.yogurt = yogurt;
        this.mantequilla = mantequilla;
        this.CremaDeLeche = CremaDeLeche;
        this.lecheCondensada = lecheCondensada;
        this.helado = helado;
        this.cuajada = cuajada;
        this.sueroDeLeche = sueroDeLeche;
        this.panTajado = panTajado;
        this.arroz = arroz;
        this.pasta = pasta;
        this.garbanzos = garbanzos;
        this.frijoles = frijoles;
        this.arveja = arveja;
        this.lentejas = lentejas;
        this.nueces = nueces;
        this.almendras = almendras;
        this.perejil = perejil;
        this.cilantro = cilantro;
        this.albahaca = albahaca;
        this.pimienta = pimienta;
        this.oregano = oregano;
        this.tomillo = tomillo;
        this.laurel = laurel;
        this.canela = canela;
        this.aceites = aceites;
        this.vinagres = vinagres;
        this.atunEnlatado = atunEnlatado;
        this.sardinasEnlatadas = sardinasEnlatadas;
        this.condimentos = condimentos;
        this.vinagretas = vinagretas;
        this.harinas = harinas;
        this.azucar = azucar;
        this.sal = sal;
    }

    //GETTER AND SETTER

    public boolean isManzanas() {
        return manzanas;
    }

    public void setManzanas(boolean manzanas) {
        this.manzanas = manzanas;
    }

    public boolean isBananos() {
        return bananos;
    }

    public void setBananos(boolean bananos) {
        this.bananos = bananos;
    }

    public boolean isNaranjas() {
        return naranjas;
    }

    public void setNaranjas(boolean naranjas) {
        this.naranjas = naranjas;
    }

    public boolean isUvas() {
        return uvas;
    }

    public void setUvas(boolean uvas) {
        this.uvas = uvas;
    }

    public boolean isFresas() {
        return fresas;
    }

    public void setFresas(boolean fresas) {
        this.fresas = fresas;
    }

    public boolean isSandias() {
        return sandias;
    }

    public void setSandias(boolean sandias) {
        this.sandias = sandias;
    }

    public boolean isMangos() {
        return mangos;
    }

    public void setMangos(boolean mangos) {
        this.mangos = mangos;
    }

    public boolean isPinas() {
        return pinas;
    }

    public void setPinas(boolean pinas) {
        this.pinas = pinas;
    }

    public boolean isLimones() {
        return limones;
    }

    public void setLimones(boolean limones) {
        this.limones = limones;
    }

    public boolean isPeras() {
        return peras;
    }

    public void setPeras(boolean peras) {
        this.peras = peras;
    }

    public boolean isMelocotones() {
        return melocotones;
    }

    public void setMelocotones(boolean melocotones) {
        this.melocotones = melocotones;
    }

    public boolean isKiwis() {
        return kiwis;
    }

    public void setKiwis(boolean kiwis) {
        this.kiwis = kiwis;
    }

    public boolean isMelones() {
        return melones;
    }

    public void setMelones(boolean melones) {
        this.melones = melones;
    }

    public boolean isCerezas() {
        return cerezas;
    }

    public void setCerezas(boolean cerezas) {
        this.cerezas = cerezas;
    }

    public boolean isPapayas() {
        return papayas;
    }

    public void setPapayas(boolean papayas) {
        this.papayas = papayas;
    }

    public boolean isMora() {
        return mora;
    }

    public void setMora(boolean mora) {
        this.mora = mora;
    }

    public boolean isUchuvas() {
        return uchuvas;
    }

    public void setUchuvas(boolean uchuvas) {
        this.uchuvas = uchuvas;
    }

    public boolean isMaracuya() {
        return maracuya;
    }

    public void setMaracuya(boolean maracuya) {
        this.maracuya = maracuya;
    }

    public boolean isMandarina() {
        return mandarina;
    }

    public void setMandarina(boolean mandarina) {
        this.mandarina = mandarina;
    }

    public boolean isCoco() {
        return coco;
    }

    public void setCoco(boolean coco) {
        this.coco = coco;
    }

    public boolean isTomates() {
        return tomates;
    }

    public void setTomates(boolean tomates) {
        this.tomates = tomates;
    }

    public boolean isZanahorias() {
        return zanahorias;
    }

    public void setZanahorias(boolean zanahorias) {
        this.zanahorias = zanahorias;
    }

    public boolean isCebollas() {
        return cebollas;
    }

    public void setCebollas(boolean cebollas) {
        this.cebollas = cebollas;
    }

    public boolean isCebolleta() {
        return cebolleta;
    }

    public void setCebolleta(boolean cebolleta) {
        this.cebolleta = cebolleta;
    }

    public boolean isLechugas() {
        return lechugas;
    }

    public void setLechugas(boolean lechugas) {
        this.lechugas = lechugas;
    }

    public boolean isPepinos() {
        return pepinos;
    }

    public void setPepinos(boolean pepinos) {
        this.pepinos = pepinos;
    }

    public boolean isPimientos() {
        return pimientos;
    }

    public void setPimientos(boolean pimientos) {
        this.pimientos = pimientos;
    }

    public boolean isEspinacas() {
        return espinacas;
    }

    public void setEspinacas(boolean espinacas) {
        this.espinacas = espinacas;
    }

    public boolean isBrocoli() {
        return brocoli;
    }

    public void setBrocoli(boolean brocoli) {
        this.brocoli = brocoli;
    }

    public boolean isPapas() {
        return papas;
    }

    public void setPapas(boolean papas) {
        this.papas = papas;
    }

    public boolean isPlatanos() {
        return platanos;
    }

    public void setPlatanos(boolean platanos) {
        this.platanos = platanos;
    }

    public boolean isChampinones() {
        return champinones;
    }

    public void setChampinones(boolean champinones) {
        this.champinones = champinones;
    }

    public boolean isApio() {
        return apio;
    }

    public void setApio(boolean apio) {
        this.apio = apio;
    }

    public boolean isAjo() {
        return ajo;
    }

    public void setAjo(boolean ajo) {
        this.ajo = ajo;
    }

    public boolean isMaiz() {
        return maiz;
    }

    public void setMaiz(boolean maiz) {
        this.maiz = maiz;
    }

    public boolean isRepollo() {
        return repollo;
    }

    public void setRepollo(boolean repollo) {
        this.repollo = repollo;
    }

    public boolean isZucchini() {
        return zucchini;
    }

    public void setZucchini(boolean zucchini) {
        this.zucchini = zucchini;
    }

    public boolean isZapallo() {
        return zapallo;
    }

    public void setZapallo(boolean zapallo) {
        this.zapallo = zapallo;
    }

    public boolean isRemolacha() {
        return remolacha;
    }

    public void setRemolacha(boolean remolacha) {
        this.remolacha = remolacha;
    }

    public boolean isRabano() {
        return rabano;
    }

    public void setRabano(boolean rabano) {
        this.rabano = rabano;
    }

    public boolean isAguacate() {
        return aguacate;
    }

    public void setAguacate(boolean aguacate) {
        this.aguacate = aguacate;
    }

    public boolean isAcelga() {
        return acelga;
    }

    public void setAcelga(boolean acelga) {
        this.acelga = acelga;
    }

    public boolean isPuerro() {
        return puerro;
    }

    public void setPuerro(boolean puerro) {
        this.puerro = puerro;
    }

    public boolean isColiflor() {
        return coliflor;
    }

    public void setColiflor(boolean coliflor) {
        this.coliflor = coliflor;
    }

    public boolean isHabichuela() {
        return habichuela;
    }

    public void setHabichuela(boolean habichuela) {
        this.habichuela = habichuela;
    }

    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }

    public boolean isCerdo() {
        return cerdo;
    }

    public void setCerdo(boolean cerdo) {
        this.cerdo = cerdo;
    }

    public boolean isPollo() {
        return pollo;
    }

    public void setPollo(boolean pollo) {
        this.pollo = pollo;
    }

    public boolean isPescado() {
        return pescado;
    }

    public void setPescado(boolean pescado) {
        this.pescado = pescado;
    }

    public boolean isTernera() {
        return ternera;
    }

    public void setTernera(boolean ternera) {
        this.ternera = ternera;
    }

    public boolean isCordero() {
        return cordero;
    }

    public void setCordero(boolean cordero) {
        this.cordero = cordero;
    }

    public boolean isConejo() {
        return conejo;
    }

    public void setConejo(boolean conejo) {
        this.conejo = conejo;
    }

    public boolean isPavo() {
        return pavo;
    }

    public void setPavo(boolean pavo) {
        this.pavo = pavo;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isSalchichas() {
        return salchichas;
    }

    public void setSalchichas(boolean salchichas) {
        this.salchichas = salchichas;
    }

    public boolean isChorizo() {
        return chorizo;
    }

    public void setChorizo(boolean chorizo) {
        this.chorizo = chorizo;
    }

    public boolean isLonganiza() {
        return longaniza;
    }

    public void setLonganiza(boolean longaniza) {
        this.longaniza = longaniza;
    }

    public boolean isButifarra() {
        return butifarra;
    }

    public void setButifarra(boolean butifarra) {
        this.butifarra = butifarra;
    }

    public boolean isMorcilla() {
        return morcilla;
    }

    public void setMorcilla(boolean morcilla) {
        this.morcilla = morcilla;
    }

    public boolean isBufalo() {
        return bufalo;
    }

    public void setBufalo(boolean bufalo) {
        this.bufalo = bufalo;
    }

    public boolean isLeche() {
        return leche;
    }

    public void setLeche(boolean leche) {
        this.leche = leche;
    }

    public boolean isQueso() {
        return queso;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }

    public boolean isYogurt() {
        return yogurt;
    }

    public void setYogurt(boolean yogurt) {
        this.yogurt = yogurt;
    }

    public boolean isMantequilla() {
        return mantequilla;
    }

    public void setMantequilla(boolean mantequilla) {
        this.mantequilla = mantequilla;
    }

    public boolean isCremaDeLeche() {
        return CremaDeLeche;
    }

    public void setCremaDeLeche(boolean cremaDeLeche) {
        this.CremaDeLeche = cremaDeLeche;
    }

    public boolean isLecheCondensada() {
        return lecheCondensada;
    }

    public void setLecheCondensada(boolean lecheCondensada) {
        this.lecheCondensada = lecheCondensada;
    }

    public boolean isHelado() {
        return helado;
    }

    public void setHelado(boolean helado) {
        this.helado = helado;
    }

    public boolean isCuajada() {
        return cuajada;
    }

    public void setCuajada(boolean cuajada) {
        this.cuajada = cuajada;
    }

    public boolean isSueroDeLeche() {
        return sueroDeLeche;
    }

    public void setSueroDeLeche(boolean sueroDeLeche) {
        this.sueroDeLeche = sueroDeLeche;
    }

    public boolean isPanTajado() {
        return panTajado;
    }

    public void setPanTajado(boolean panTajado) {
        this.panTajado = panTajado;
    }

    public boolean isArroz() {
        return arroz;
    }

    public void setArroz(boolean arroz) {
        this.arroz = arroz;
    }

    public boolean isPasta() {
        return pasta;
    }

    public void setPasta(boolean pasta) {
        this.pasta = pasta;
    }

    public boolean isGarbanzos() {
        return garbanzos;
    }

    public void setGarbanzos(boolean garbanzos) {
        this.garbanzos = garbanzos;
    }

    public boolean isFrijoles() {
        return frijoles;
    }

    public void setFrijoles(boolean frijoles) {
        this.frijoles = frijoles;
    }

    public boolean isArveja() {
        return arveja;
    }

    public void setArveja(boolean arveja) {
        this.arveja = arveja;
    }

    public boolean isLentejas() {
        return lentejas;
    }

    public void setLentejas(boolean lentejas) {
        this.lentejas = lentejas;
    }

    public boolean isNueces() {
        return nueces;
    }

    public void setNueces(boolean nueces) {
        this.nueces = nueces;
    }

    public boolean isAlmendras() {
        return almendras;
    }

    public void setAlmendras(boolean almendras) {
        this.almendras = almendras;
    }

    public boolean isPerejil() {
        return perejil;
    }

    public void setPerejil(boolean perejil) {
        this.perejil = perejil;
    }

    public boolean isCilantro() {
        return cilantro;
    }

    public void setCilantro(boolean cilantro) {
        this.cilantro = cilantro;
    }

    public boolean isAlbahaca() {
        return albahaca;
    }

    public void setAlbahaca(boolean albahaca) {
        this.albahaca = albahaca;
    }

    public boolean isPimienta() {
        return pimienta;
    }

    public void setPimienta(boolean pimienta) {
        this.pimienta = pimienta;
    }

    public boolean isOregano() {
        return oregano;
    }

    public void setOregano(boolean oregano) {
        this.oregano = oregano;
    }

    public boolean isTomillo() {
        return tomillo;
    }

    public void setTomillo(boolean tomillo) {
        this.tomillo = tomillo;
    }

    public boolean isLaurel() {
        return laurel;
    }

    public void setLaurel(boolean laurel) {
        this.laurel = laurel;
    }

    public boolean isCanela() {
        return canela;
    }

    public void setCanela(boolean canela) {
        this.canela = canela;
    }

    public boolean isAceites() {
        return aceites;
    }

    public void setAceites(boolean aceites) {
        this.aceites = aceites;
    }

    public boolean isVinagres() {
        return vinagres;
    }

    public void setVinagres(boolean vinagres) {
        this.vinagres = vinagres;
    }

    public boolean isAtunEnlatado() {
        return atunEnlatado;
    }

    public void setAtunEnlatado(boolean atunEnlatado) {
        this.atunEnlatado = atunEnlatado;
    }

    public boolean isSardinasEnlatadas() {
        return sardinasEnlatadas;
    }

    public void setSardinasEnlatadas(boolean sardinasEnlatadas) {
        this.sardinasEnlatadas = sardinasEnlatadas;
    }

    public boolean isCondimentos() {
        return condimentos;
    }

    public void setCondimentos(boolean condimentos) {
        this.condimentos = condimentos;
    }

    public boolean isVinagretas() {
        return vinagretas;
    }

    public void setVinagretas(boolean vinagretas) {
        this.vinagretas = vinagretas;
    }

    public boolean isHarinas() {
        return harinas;
    }

    public void setHarinas(boolean harinas) {
        this.harinas = harinas;
    }

    public boolean isAzucar() {
        return azucar;
    }

    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }

    public boolean isSal() {
        return sal;
    }

    public void setSal(boolean sal) {
        this.sal = sal;
    }

    //TOSTRING


    @Override
    public String toString() {
        return "MarketProducts{" +
                "apples=" + manzanas +
                ", bananas=" + bananos +
                ", oranges=" + naranjas +
                ", grapes=" + uvas +
                ", strawberries=" + fresas +
                ", watermelons=" + sandias +
                ", mangos=" + mangos +
                ", pineapples=" + pinas +
                ", lemons=" + limones +
                ", pears=" + peras +
                ", peaches=" + melocotones +
                ", kiwis=" + kiwis +
                ", melons=" + melones +
                ", cherries=" + cerezas +
                ", papayas=" + papayas +
                ", blackberry=" + mora +
                ", uchuvas=" + uchuvas +
                ", maracuya=" + maracuya +
                ", mandarina=" + mandarina +
                ", coco=" + coco +
                ", tomatoes=" + tomates +
                ", carrots=" + zanahorias +
                ", onions=" + cebollas +
                ", cebolleta=" + cebolleta +
                ", lettuces=" + lechugas +
                ", cucumbers=" + pepinos +
                ", bellPeppers=" + pimientos +
                ", spinach=" + espinacas +
                ", broccoli=" + brocoli +
                ", potatoes=" + papas +
                ", plantains=" + platanos +
                ", mushrooms=" + champinones +
                ", celery=" + apio +
                ", garlic=" + ajo +
                ", corn=" + maiz +
                ", repollo=" + repollo +
                ", zucchini=" + zucchini +
                ", zapallo=" + zapallo +
                ", remolacha=" + remolacha +
                ", rabano=" + rabano +
                ", aguacate=" + aguacate +
                ", acelga=" + acelga +
                ", puerro=" + puerro +
                ", coliflor=" + coliflor +
                ", habichuela=" + habichuela +
                ", beef=" + res +
                ", pork=" + cerdo +
                ", chicken=" + pollo +
                ", fish=" + pescado +
                ", veal=" + ternera +
                ", lamb=" + cordero +
                ", rabbit=" + conejo +
                ", turkey=" + pavo +
                ", ham=" + jamon +
                ", sausages=" + salchichas +
                ", chorizo=" + chorizo +
                ", longanizaSausage=" + longaniza +
                ", butifarraSausage=" + butifarra +
                ", bloodSausage=" + morcilla +
                ", buffalo=" + bufalo +
                ", milk=" + leche +
                ", cheese=" + queso +
                ", yogurt=" + yogurt +
                ", butter=" + mantequilla +
                ", cream=" + CremaDeLeche +
                ", condensedMilk=" + lecheCondensada +
                ", iceCream=" + helado +
                ", curd=" + cuajada +
                ", buttermilk=" + sueroDeLeche +
                ", slicedBread=" + panTajado +
                ", rice=" + arroz +
                ", pasta=" + pasta +
                ", chickpeas=" + garbanzos +
                ", beans=" + frijoles +
                ", arveja=" + arveja +
                ", lentils=" + lentejas +
                ", walnuts=" + nueces +
                ", almonds=" + almendras +
                ", parsley=" + perejil +
                ", coriander=" + cilantro +
                ", basil=" + albahaca +
                ", pepper=" + pimienta +
                ", oregano=" + oregano +
                ", thyme=" + tomillo +
                ", bayLeaf=" + laurel +
                ", cinnamon=" + canela +
                ", oils=" + aceites +
                ", vinegars=" + vinagres +
                ", cannedTuna=" + atunEnlatado +
                ", cannedSardines=" + sardinasEnlatadas +
                ", condiments=" + condimentos +
                ", vinaigrettes=" + vinagretas +
                ", flours=" + harinas +
                ", sugar=" + azucar +
                ", salt=" + sal +
                '}';
    }
}
