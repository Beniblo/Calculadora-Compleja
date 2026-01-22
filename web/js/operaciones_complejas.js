async function realizarOperacion(oper)
{   
    let a = parseFloat(document.getElementById("txtReal1").value);
    let b = parseFloat(document.getElementById("txtImg1").value);
    let c = parseFloat(document.getElementById("txtReal2").value);
    let d = parseFloat(document.getElementById("txtImg2").value);

    let res  = '';

    switch (oper) {
        case 1: res = await sumar(a, b, c, d);
            break;
        case 2: res = await restar(a, b, c, d);
            break;
        case 3: res = await multiplicar(a, b, c, d);
            break;
        case 4: res = await dividir(a, b, c, d);
            break;
        default:
            break;
    }

    document.getElementById("txtResultado").value = res;
}

async function sumar(a, b, c, d)
{
    let url = "api/restoperacionescomplejas/adicionar?realuno=" + a 
                                                    + "&imauno=" + b 
                                                    + "&realdos=" + c 
                                                    + "&imados=" + d;

    let resp = await fetch(url);
    let data = await resp.json();
    
    console.log("Respuesta del servidor:", data);
    
    return data.resultado;
}

async function restar(a, b, c, d)
{
    let url = "api/restoperacionescomplejas/restar?realuno=" + a 
                                                    + "&imauno=" + b 
                                                    + "&realdos=" + c 
                                                    + "&imados=" + d;

    let resp = await fetch(url);
    let data = await resp.json();
    return data.resultado;                                           
}

async function multiplicar(a, b, c, d)
{
    let url = "api/restoperacionescomplejas/multiplicar?realuno=" + a 
                                                    + "&imauno=" + b 
                                                    + "&realdos=" + c 
                                                    + "&imados=" + d;

    let resp = await fetch(url);
    let data = await resp.json();
    return data.resultado;                                                 
}

async function dividir(a, b, c, d)
{
    let url = "api/restoperacionescomplejas/dividir?realuno=" + a 
                                                    + "&imauno=" + b 
                                                    + "&realdos=" + c 
                                                    + "&imados=" + d;

    let resp = await fetch(url);
    let data = await resp.json();
    return data.resultado;                                               
}