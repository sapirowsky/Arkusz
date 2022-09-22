#include <iostream>
#include <string>

using namespace std;
/********************************************************
* nazwa funkcji: szyfrowanie
* 
* parametry wejściowe: mailToHash - parametr wymagany, przyjmuje podany przez mail do szyfrowania
* wartość zwracana: funkcja zwaraca zaszyfrowany mail
* opis funkcji: funkcja wykonuje pętle po kolei po każdej literce podanego maila i sprawdza czy dana literka powinna zostać zastopiąna
* 
* autor: Kamil K. Błażej K.
* ****************************************************/
string szyfrowanie(string mailToHash){
    for(int i = 0; i < mailToHash.length(); i++){
        if(mailToHash[i] == 'p'){
            mailToHash[i] = 'o';
        }else if(mailToHash[i] == 'r'){
            mailToHash[i] = 'y';
        }else if(mailToHash[i] == 'o'){
            mailToHash[i] = 'p';
        }else if(mailToHash[i] == 'g'){
            mailToHash[i] = 'a';
        }else if(mailToHash[i] == 'r'){
            mailToHash[i] = 'y';
        }else if(mailToHash[i] == 'a'){
            mailToHash[i] = 'g';
        }else if(mailToHash[i] == 'm'){
            mailToHash[i] = 'm';
        }
    }
    return mailToHash;
}
/********************************************************
* nazwa funkcji: main
* 
* parametry wejściowe: nie posiada
* wartość zwracana: 0/false
* opis funkcji: funkcja pobiera od użytkownika maila przekazuje go do funnkcji szyfrowanie i na końcu wypisuję zaszyfrowany mail do konsoli
* 
* autor: Kamil K. Błażej K.
* ****************************************************/
int main(){
    string mail;
    string hashedMail;
    cout<<"Podaj maila: ";
    cin>>mail;
    hashedMail = szyfrowanie(mail);
    cout<<endl<<"Zaszyfrowany mail: "<<hashedMail<<endl;
    system("pause");
    return 0;
}