{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": []
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "lQQnEARdoHzm"
      },
      "outputs": [],
      "source": [
        "package org.greenspark404.kanbanboard.config;\n",
        "\n",
        "import org.springframework.beans.factory.annotation.Value;\n",
        "import org.springframework.context.annotation.Bean;\n",
        "import org.springframework.context.annotation.Configuration;\n",
        "import org.springframework.mail.javamail.JavaMailSender;\n",
        "import org.springframework.mail.javamail.JavaMailSenderImpl;\n",
        "\n",
        "@Configuration\n",
        "public class MailConfig {\n",
        "\n",
        "    @Value(\"${spring.mail.host:}\")\n",
        "    private String host;\n",
        "\n",
        "    @Value(\"${spring.mail.username:}\")\n",
        "    private String username;\n",
        "\n",
        "    @Value(\"${spring.mail.password:}\")\n",
        "    private String password;\n",
        "\n",
        "    @Value(\"${spring.mail.port:0}\")\n",
        "    private int port;\n",
        "\n",
        "    @Value(\"${spring.mail.protocol:}\")\n",
        "    private String protocol;\n",
        "\n",
        "    @Bean\n",
        "    public JavaMailSender mailSender() {\n",
        "        JavaMailSenderImpl sender = new JavaMailSenderImpl();\n",
        "        sender.setHost(host);\n",
        "        sender.setUsername(username);\n",
        "        sender.setPassword(password);\n",
        "        sender.setProtocol(protocol);\n",
        "        sender.setPort(port);\n",
        "\n",
        "        return sender;\n",
        "    }\n",
        "\n",
        "}"
      ]
    }
  ]
}