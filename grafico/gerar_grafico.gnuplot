set terminal jpeg size 800,1200
set output './dados/grafico.jpg'
set datafile separator ","

set multiplot layout 2,1 title "Funções Trigonométricas" font ",14"

# Primeiro gráfico: sin(t)
set title "Gráfico de Seno"
set xlabel "Tempo (s)"
set ylabel "sin(t)"
plot './dados/input.csv' using 1:2 with lines title "sin(t)" lt rgb "blue"

# Segundo gráfico: sin(t) com Ruido
set title "Gráfico de Seno com Ruído"
set xlabel "Tempo (s)"
set ylabel "sin(t) com Ruido"
plot './dados/input.csv' using 1:3 with lines title "sin(t) - com ruído" lt rgb "red"

unset multiplot