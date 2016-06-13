1. Datová struktura
    a. analýza formátů datové struktury konfiguračních souborů (InputStructureTree - IST)
    b. návrh datové struktury s ohledem na specifika IST (reference, abstraktní záznamy)
    c. podpora autokonverzí
    d. validace datové struktury dle konkrétního IST
    e. systém pro zpracování a hlášení detekovaných chyb
2. YAML
    a. návrh YAML syntaxe pro zápis konfiguračních souborů
        - podpora referencí (anchor/alias, merge)
        - podpora abstraktních záznamů (tagy)
    b. načtení datové struktury z YAML souboru
    c. *detekování hranic v datové stuktuře (využití pro dokončování, nápovědu, ...)
3. grafické rozhraní
    a. základní funkce editoru (undo/redo, nalezení a nahrazení, odsazení ...)
    b. podpora klávesových zkratek
    c. dokončování názvu klíčů a hodnot výběrového typu v editoru
    d. grafické znázornění datové struktury (strom)
    e. *zvýraznění syntaxe v editoru
    f. zobrazení nápovědy generované z IST

Poznámky:

1.a,b,c,d: Z velké části převzáno z projektu až na menší změny a úpravy.
1.e: Systém vyjímek byl částečně převzán z projektu, ale předělán, upraven a vylepšen pro zakomponování do grafického rozhraní.

2.a: Nově řešeno (nebylo součástí projektu). Návrh byla spolupráce s Pavlem R. a Honzou B. Šlo o zjišťování možností YAMLu, a jak je co nejlépe využít pro datovou stukturu.
2.b: Pro samotné parsování syntaxe je využita knihovna. Některé její části jsem upravil nebo doplnil.
2.c: Poměrně složitá věc, kterou z velké části řešil i Pavel R. Možná bych to neuváděl do zadání, ale v samotné práci bych se o tom alespoň okrajově zmínil.

3.a,b,c: Jedná se o takový základ pro rozhraní editoru. Vyjmenované věci jsem dělal já a další komponenty zase Pavel. Jelikož se jedná o nějaké funkce v GUI, tak bych v tom neviděl problém, protože to na té práci asi není to nejdůležitější.
3.d: Stromová stuktura zatím slouží pouze pro zobrazení dat. Honza B. má v plánu další funkce, které bych do zadání radši neuváděl. Plánuje se editace hodnot přímo ve stromu, přesouvání hodnot v poli atd. Není ovšem jisté, jestli se to nakonec použije. Grafická reprezentace pomocí stromu však s velkou pravděpodobností ve finální aplikaci zůstane.
3.e: Další bod, u kterého si nejsem jistý. Editor omezeným způsobem podporuje zvýraznění syntaxe bez nutnosti vlastní implementace. Není to však dokonalé a je možné, že se to bude řešit. Do zadání bych to asi neuváděl, ale v práci se to možná vyskytne.
3.f: Samotné generování nápovědy zajišťuje knihovna, kterou napsal Honza Hybš. V knihovně jsem provedl nějaké menší změny a dále budu mít na starosti úpravy grafického provedení. Mým hlavním úkolem je ale provázat tuto dokumentaci s datovou strukturou a zajistit její správné zobrazení vzhledem k pozici kurzoru atd. Souvisí to trochu s bodem 2.c, takže některé využité funkce bude mít možná na starosti Pavel.

Rád bych v zadání vůbec neuváděl části aplikace, které jsem neměl na starosti a dělal je pouze Pavel. Jsou to především samostatné moduly, které do zbytku aplikace nijak nezasahují. Konkrétně se jedná o import JSON souborů a jejich konverzi do YAMLu. Dále funkce pro transformaci datové stuktury (přejměnování nebo mazání klíčů apod.), které se využijí pro převod mezi různými verzemi IST, které jsou jinak nekompatibilní. 
