public String capitalizaNome(String nomeCompleto) {
		StringBuilder nome = new StringBuilder(nomeCompleto);
		String inicial = "";
		String outrasIniciais = "";
		inicial = nome.substring(0, 1).toUpperCase();
		nome = nome.replace(0, 1, inicial);
		for (int i = 0; i < nome.length(); i++) {
			if (nome.charAt(i) == ' ') {
				i++;
				if (checaParteNome(nome.toString(), i)) {
					outrasIniciais = nome.substring(i, i + 1).toUpperCase();
					nome = nome.replace(i, i + 1, outrasIniciais);
					i--;
				}
			}
		}
		return nome.toString();
	}

	public boolean checaParteNome(String nomeCompleto, int posicao) {
		if (nomeCompleto.substring(posicao, posicao + 3).equals("dos")) {
			System.out.print("'dos' encontrado; ");
			return false;
		} else if (nomeCompleto.substring(posicao, posicao + 2).equals("da")) {
			System.out.print("'da' encontrado; ");
			return false;
		} else if (nomeCompleto.substring(posicao, posicao + 2).equals("de")){
			System.out.print("'de' encontrado; ");
			return false;
		} else {
			return true;
		}
	}
